package com.mySb.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mySb.model.RawIngredientModel;

@Service
public class RawIngredientService {

	private final RawIngredientModelDao ingredientModelDao;
	@Autowired
	public RawIngredientService(@Qualifier("RawDao")RawIngredientModelDao ingredientModelDao) {		
		this.ingredientModelDao = ingredientModelDao;
	}
	
	public RawIngredientModel saveNewRawIngredient(RawIngredientModel  model) {
		return ingredientModelDao.persistNewRawIngredientModel(model);
	}
	
	public RawIngredientModel selectRawIngredientModelByName(String name) {
		return this.ingredientModelDao.getIngredientByName(name);
	}
	
	public List<RawIngredientModel> selectAllRawIngredientModel() {
		return this.ingredientModelDao.findAll();
	}
	
}
