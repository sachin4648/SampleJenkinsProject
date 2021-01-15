package com.test.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductDAOimplTest {

	@Test
	public void createAProduct() {

		ProductDAO dao= new ProductDAOImpl();
	}
	
	@Test
	public void Test01() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
	
	@Test
	public void Test02() {
		System.out.println("This is sampple unit testing");
	}
}
