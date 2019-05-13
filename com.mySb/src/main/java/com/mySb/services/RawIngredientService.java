package com.mySb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mySb.model.RawIngredientModel;
import com.mySb.model.dao.RawIngredientModelDao;

@Service
public class RawIngredientService {
	
	private final RawIngredientModelDao ingredientModelDao;
	
	  @Autowired 
	  public RawIngredientService(@Qualifier("RawDao")RawIngredientModelDao
	  ingredientModelDao) 
	  { 
		  this.ingredientModelDao = ingredientModelDao; 
		  }
	 
	
	/*
	 * @Autowired public RawIngredientService(RawIngredientModelDao
	 * ingredientModelDao) { this.ingredientModelDao = ingredientModelDao; }
	 */
	
	public List<RawIngredientModel> getAllRawIngredientModel(){
		return ingredientModelDao.findAll();
	}
	
}
