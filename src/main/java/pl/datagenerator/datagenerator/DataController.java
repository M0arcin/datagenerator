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

        for(int i = size; i>0; i--){
            countryList.add(new Country(type, 65483214, null, "Oksywska", "Oksywska, Poland", null, "location", "Poland", new GeoPosition( 51.0855422,  16.9987442) , 757423, true, "PL", true, null));
        }
            return countryList;
        }


}