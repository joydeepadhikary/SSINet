package com.mySb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="RAW_INGREDIENT")
public class RawIngredientModel {
	@Id
	private String id;
	private final String name;
	
	public RawIngredientModel(@JsonProperty String id, @JsonProperty String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Raw Ingredient [id=" + id + ", name=" + name + "]";
	} 
	
	
	
	
}
