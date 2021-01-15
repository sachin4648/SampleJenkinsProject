package com.test.dao;

import java.util.HashMap;
import java.util.Map;

import com.test.dto.Product;

public class ProductDAOImpl implements ProductDAO{

	Map<Integer, Product> products = new HashMap<Integer, Product>();
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		//products.put(products.get(products), products);
	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
