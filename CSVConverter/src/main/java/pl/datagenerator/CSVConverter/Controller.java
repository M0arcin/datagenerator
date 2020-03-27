package pl.datagenerator.CSVConverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Method;
import java.util.Arrays;

@RestController
public class Controller {

    // in case endpoint should not return a CSV file to download remove "produces = "text/csv"" from @GetMapping arguments
    @GetMapping(value = "/converter/csv", produces = "text/csv")
    public String convertToCsv(){
        RestTemplate restTemplate = new RestTemplate();
        Country country[] = restTemplate.getForObject("http://localhost:8080/generate/json/10", Country[].class); // generates array with country objects gotten from first microservice
        //currently it's generating 10 set of data but that value can be changed

        StringBuilder outputCsv = new StringBuilder();
        String CSV_SEPARATOR = ",";

        String[] header = {"_type","_id","name","type","latitude", "longitude"}; // array of attributes which values will be generated
        for(String string : header){
            outputCsv.append(string);
            outputCsv.append(CSV_SEPARATOR);
        }

        outputCsv.deleteCharAt((outputCsv.length())-1); // deletes last comma inside outputCsv
        outputCsv.append("\n");

        for (Country country1 : country)
        {
            outputCsv.append(country1.get_type());
            outputCsv.append(CSV_SEPARATOR);
            outputCsv.append(country1.getId());
            outputCsv.append(CSV_SEPARATOR);
            outputCsv.append(country1.getName());
            outputCsv.append(CSV_SEPARATOR);
            outputCsv.append(country1.getType());
            outputCsv.append(CSV_SEPARATOR);
            outputCsv.append(country1.getGeo_position().getLatitude());
            outputCsv.append(CSV_SEPARATOR);
            outputCsv.append(country1.getGeo_position().getLongitude());
            outputCsv.append("\n");
        }
        return outputCsv.toString();
    }

    // in case endpoint should not return a CSV file to download remove "produces = "text/csv"" from @GetMapping arguments
    @GetMapping(value = "/converter/csv/{headers}", produces = "text/csv")
    public String convertToCsvVariables(@PathVariable String headers ) {

        String headersArray[] = headers
                .replaceAll("\\s+", "")
                .toLowerCase()
                .split(","); // Put headers into array, removes spaces from them and convert to lower case


        RestTemplate restTemplate = new RestTemplate();
        Country country[] = restTemplate.getForObject("http://localhost:8080/generate/json/10", Country[].class); // generates array with country objects gotten from first microservice
        //currently it's generating 10 set of data but that value can be changed


        StringBuilder outputCsv = new StringBuilder();
        String CSV_SEPARATOR = ",";


        String[] desiredHeaders = {"_type", "id", "key", "name", "fullname", "iata_airport_code", "type", "country", "latitude", "longitude", "location_id", "ineurope", "countrycode", "corecountry", "distance"};

        // this for loop checks if attributes provided by user match name of fields and if so adds them as CSV headers
        for(String header : headersArray){
            if(Arrays.asList(desiredHeaders).contains(header)){
                outputCsv.append(header);
                outputCsv.append(CSV_SEPARATOR);
            }
        }

        outputCsv.deleteCharAt((outputCsv.length())-1); // deletes last comma inside outputCsv
        outputCsv.append("\n"); // jumps to a new row

        for (Country country1 : country) // iterates through an array of countries and based on attributes provided by user, calls getters and inserts values into CSV
        {
            for(String attribute : headersArray) {
                if(attribute.equals("latitude") || attribute.equals("longitude") || attribute.equals("_type")){
                    switch(attribute){
                        case "latitude":
                            outputCsv.append(country1.getGeo_position().getLatitude());
                            outputCsv.append(CSV_SEPARATOR);
                            break;
                        case "longitude":
                            outputCsv.append(country1.getGeo_position().getLongitude());
                            outputCsv.append(CSV_SEPARATOR);
                            break;
                        case "_type":
                            outputCsv.append(country1.get_type());
                            outputCsv.append(CSV_SEPARATOR);
                            break;
                    }
                } else {
                    try{
                        // dynamic getter made with Reflection; changes attribute first letter to UpperCase so it matches getter stylistics
                        Method method = country1.getClass().getMethod("get" + attribute.substring(0, 1).toUpperCase() + attribute.substring(1));

                        outputCsv.append(method.invoke(country1));
                        outputCsv.append(CSV_SEPARATOR);
                    }catch(Exception ex){
                    }
                }
            }
            outputCsv.deleteCharAt((outputCsv.length())-1); // deletes last comma inside outputCsv
            outputCsv.append("\n"); // jumps to a new row
        }

        return outputCsv.toString();

    }





}
