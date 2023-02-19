package com.example.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.vinModel.Example;
import com.example.demo.vinModel.ZipCode;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VinController {

	@Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/info/{vin}")
    public ResponseEntity<Map<String, String>> vinDecoder(@PathVariable String vin) {
        
        HttpHeaders header = new HttpHeaders();
        Map<String, String> response = new HashMap<>();
        //header.setContentType(MediaType.APPLICATION_JSON);
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        header.set("X-RapidAPI-Key","d6e1c11ff6msh46d154e380268f1p1589fdjsn50a8fbf2e85e");
        header.set("X-RapidAPI-Host", "vin-decoder19.p.rapidapi.com");
        //Represents an HTTP request or response entity, consisting of headers and body.
        HttpEntity<String> entity = new HttpEntity<String>(header);
        Example vInfo = restTemplate.exchange("https://vin-decoder19.p.rapidapi.com/vin_decoder_extended?vin="+vin,
                HttpMethod.GET, entity, Example.class).getBody();
        response.put("info", vInfo.getVehicleSummary());
        
        response.put("fuelType", vInfo.getFuelType().getValue());
        String engineDisp =vInfo.getEngineDisplacement().getValue();
        if(engineDisp.equalsIgnoreCase("No data")) {
            String fuel=vInfo.getFuelType().getValue();
            if(fuel.equalsIgnoreCase("ELECTRIC")) {
                response.put("engineCapacity", "50");
            }
            else {
                response.put("engineCapacity","2.5");
            }
        }else {
            response.put("engineCapacity",vInfo.getEngineDisplacement().getValue());
        }
        response.put("price", vInfo.getMsrPrice().getValue());
        
     String a = response.toString();
        return ResponseEntity.ok(response);
//        return restTemplate.exchange("https://vin-decoder19.p.rapidapi.com/vin_decoder_basic?vin"+vin,
//            HttpMethod.GET, entity, VehicleInfo.class).getBody();
        
    }
    

    @GetMapping("/zipcode/{pin}")
    public ResponseEntity<Map<String, String>>ZipCodeDecoder(@PathVariable String pin) {
        
        HttpHeaders header = new HttpHeaders();
        Map<String, String> response = new HashMap<>();
        //header.setContentType(MediaType.APPLICATION_JSON);
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        header.set("X-RapidAPI-Key","3f973b8074msh8d2e88f6f4a2d61p19bff2jsn944f371f5a62");
        header.set("X-RapidAPI-Host", "autocomplete-india.p.rapidapi.com");
        //Represents an HTTP request or response entity, consisting of headers and body.
        HttpEntity<String> entity = new HttpEntity<String>(header);
        ZipCode zInfo = restTemplate.exchange("https://autocomplete-india.p.rapidapi.com/marketplace/autocomplete/india/pincodes/"+pin,
                HttpMethod.GET, entity, ZipCode.class).getBody();
        String[] splitedLoc = zInfo.extractZip();
        response.put("zipcode", splitedLoc[0]);
        response.put("district", splitedLoc[1]);
        response.put("state", splitedLoc[2]);
        return ResponseEntity.ok(response);
    }
	
}