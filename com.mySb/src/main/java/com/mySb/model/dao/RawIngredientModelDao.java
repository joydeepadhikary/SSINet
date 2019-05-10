package com.mySb.model.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mySb.model.RawIngredientModel;

public interface RawIngredientModelDao extends MongoRepository<RawIngredientModel, String>{

	List<RawIngredientModel> getAllRawIngredient();	
	RawIngredientModel getIngredientByName(String name);
	RawIngredientModel getIngredientById(String id);	
	RawIngredientModel persistNewRawIngredientModel(RawIngredientModel model);
	
	
}
