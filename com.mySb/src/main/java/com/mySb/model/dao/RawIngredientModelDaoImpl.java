package com.mySb.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mySb.model.RawIngredientModel;

@Repository("RawDao")
public class RawIngredientModelDaoImpl implements RawIngredientModelDao {

	private JdbcTemplate jdbdTemplate;
	@Override
	public List<RawIngredientModel> getAllRawIngredient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RawIngredientModel getIngredientByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RawIngredientModel getIngredientById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RawIngredientModel persistNewRawIngredientModel(RawIngredientModel model) {	
		return model;
		
	}

	@Override
	public <S extends RawIngredientModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RawIngredientModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RawIngredientModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RawIngredientModel> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RawIngredientModel> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RawIngredientModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RawIngredientModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<RawIngredientModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RawIngredientModel> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<RawIngredientModel> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<RawIngredientModel> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(RawIngredientModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends RawIngredientModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends RawIngredientModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RawIngredientModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RawIngredientModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends RawIngredientModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
