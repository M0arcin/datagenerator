package pl.datagenerator.datagenerator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DataController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/generate/json/{size}")
    public List<Optional<Country>> getCountries(@PathVariable int size){
        int id = 1;
        List<Optional<Country>> countryList= new ArrayList<>();
        
        for(int i = size; i > 0; i--){

            int ranNum = (int)(Math.random()*((10-1)+1))+1; // select random integer within a range of IDs inside repository (from 1 to 10)

            if(countryRepository.findById(ranNum).isPresent()){
                countryList.add(Optional.of(new Country(
                                countryRepository.findById(ranNum).get().get_type(),
                                id,
                                countryRepository.findById(ranNum).get().getKey(),
                                countryRepository.findById(ranNum).get().getName(),
                                countryRepository.findById(ranNum).get().getFullName(),
                                countryRepository.findById(ranNum).get().getIata_airport_code(),
                                countryRepository.findById(ranNum).get().getType(),
                                countryRepository.findById(ranNum).get().getCountry(),
                                countryRepository.findById(ranNum).get().getGeo_position(),
                                countryRepository.findById(ranNum).get().getLocation_id(),
                                countryRepository.findById(ranNum).get().isInEurope(),
                                countryRepository.findById(ranNum).get().getCountryCode(),
                                countryRepository.findById(ranNum).get().isCoreCountry(),
                                countryRepository.findById(ranNum).get().getDistance()
                            )
                        )
                );   // creates new instance of a country object using data from randomly selected object inside repository
                // It is done this way to allow incrementation of ID. I tried to avoid copy() and serialization. First one acts weird with mutable objects and performance of latter is quite slow.

            }

            id++;
        }
            return countryList;
        }



}