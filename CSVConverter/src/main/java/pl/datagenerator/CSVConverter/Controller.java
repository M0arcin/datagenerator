package pl.datagenerator.CSVConverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @GetMapping("/converter")
    public Country[] getCSVInfo(){
        RestTemplate restTemplate = new RestTemplate();
        Country country[] = restTemplate.getForObject("http://localhost:8080/generate/json/6", Country[].class);

        return country;
    }

}
