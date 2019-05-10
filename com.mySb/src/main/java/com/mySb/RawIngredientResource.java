package com.mySb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mySb.model.RawIngredientModel;
import com.mySb.services.RawIngredientService;

@RestController
@RequestMapping("ssinet/v1/rawingredients")
public class RawIngredientResource {
	
	private final RawIngredientService service;

	@Autowired
	public RawIngredientResource(RawIngredientService service) {
		this.service = service;
	}
	
	@RequestMapping(method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RawIngredientModel> getAllRawIngredientModel(){
		return service.getAllRawIngredientModel();
	}

}
