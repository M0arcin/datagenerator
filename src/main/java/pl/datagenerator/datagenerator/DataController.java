package pl.datagenerator.datagenerator;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class DataController {

    private final String type = "Position";

    @GetMapping("/generate/json/{size}")
    public List<Country> getCountries(@PathVariable int size){
        List <Country> countryList = new ArrayList<>();

        Country[] countryArray = new Country[10]; // not sure if it's the best way to store it

        countryArray [0] = new Country(type, 1, null, "Oksywska", "Oksywska, Poland", null, "location", "Poland", new GeoPosition( 51.0855422,  16.9987442) , 757423, true, "PL", false, null);
        countryArray [1] = new Country(type, 2, null, "Hillingdon" , "Hillingdon, London, United Kingdom", "LHR" , "location", "Great Britain", new GeoPosition(51.469603, -0.453566), 757424,true, "GB", true, null);
        countryArray [2] = new Country(type, 3, null, "Richmond" , "Richmond, British Columbia, Canada" , "YVR" , "location", "Canada", new GeoPosition(49.1966913, -123.18151230000001), 757425,false, "CA", true, null);
        countryArray [3] = new Country(type, 4, null, "Mascot" , "Mascot, New South Wales, Australia", "SYD" , "location", "Australia", new GeoPosition(-33.946111, 151.177222), 757426,false, "AU", true, null);
        countryArray [4] = new Country(type, 5, null, "Ōta" , "Ōta, Tokyo, Japan", "HND" , "location", "Japan", new GeoPosition(35.553333, 139.781111), 757427,false, "JP", true, null);
        countryArray [5] = new Country(type, 6, null, "Lago Sul" , "Lago Sul, DF, Brazil", "BSB" , "location", "Brazil", new GeoPosition(-15.869167, -47.920833), 757428,false, "BR", true, null);
        countryArray [6] = new Country(type, 7, null, "Paris" , "Paris, France", "CDG" , "location", "France", new GeoPosition(49.009722, 2.547778), 757429,true, "FR", true, null);
        countryArray [7] = new Country(type, 8, null, "Niamey" , "Niamey, Niger", "NIM" , "location", "Niger", new GeoPosition(13.481667, 2.170278), 757430,false, "NE", false, null);
        countryArray [8] = new Country(type, 9, null, "Kempton Park" , "Kempton Park, Ekurhuleni, Gauteng, South Africa", "JNB" , "location", "South Africa", new GeoPosition(-26.133333, 28.25), 757431,false, "ZA", true, null);
        countryArray [9] = new Country(type, 10, null, "Aleja Wiśniowa 23" , "Aleja Wiśniowa 23, Wrocław, Poland", null , "location", "Poland", new GeoPosition(51.085364, 17.014500), 757432,true, "PL", false, null);

        int id = 1;

        for(int i = size; i > 0; i--){
            countryList.add(countryArray[(int)(Math.random()*( 9 + 1 ))]); // adds randomly selected object into the List
            countryList.get(countryList.size() - 1).set_id(id); // sets _id in the newest object inside countryList and increment it in the next line,
            id++;
        }
            return countryList;
        }


}