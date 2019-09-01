package com.example.demo.controller;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.InformationService;
import com.example.demo.beans.Information;
import com.example.demo.beans.InformationList;

import java.math.BigDecimal;
import java.net.URI;

@RestController
@RequestMapping(path="/information")
public class InformationController {

	 @Autowired
	    private InformationService informationService;
	    
	 @GetMapping(path="/",
			 produces = "application/json")	 
	 public InformationList getInformation()
	    {
	        return informationService.getAllInformation();
	    }

	 
	 @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
	    public ResponseEntity<Object> addInformation(@RequestBody Information information)
	    {
		 
			Integer id = informationService.getAllInformation().getInformationList().size() + 1;
	        information.setId("PRODGN-00"+id);
	        //information.setProduct("GENERIC");
	        //information.setSelldate(LocalDateTime.now());
	        //information.setPrice(new BigDecimal("100.00"));
	        
	        informationService.addInformation(information);         
	        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
	                                    .path("/{id}")
	                                    .buildAndExpand(information.getId())
	                                    .toUri();
	         
	        return ResponseEntity.created(location).build();
	    }
	 
	
}
