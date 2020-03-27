package pl.datagenerator.CSVConverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    // in case endpoint should not return a CSV file to download remove "produces = "text/csv"" from @GetMapping arguments
    @GetMapping(value = "/converter/csv", produces = "text/csv")
    public String convertToCsv(){
        RestTemplate restTemplate = new RestTemplate();
        Country country[] = restTemplate.getForObject("http://localhost:8080/generate/json/10", Country[].class); // generates array with country objects gotten from first microservice
        //currently it's generating 10 set of datas but that value can be changed

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





}
