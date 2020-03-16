package pl.datagenerator.datagenerator;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {

    private final String type = "Position";

    @GetMapping("/generate/json")
    public Country getCountries(){
            GeoPosition geoPosition2 = new GeoPosition( 51.0855422,  16.9987442);
            return new Country(type, 5, null, "Oksywska", "Oksywska, Poland", null, "location", "Poland", geoPosition2 , 757423, true, "PL", true, null);
        }


}