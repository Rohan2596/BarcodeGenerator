package com.example.barCodeGenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barCodeGenerator.model.Product;
import com.example.barCodeGenerator.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public Iterable<Product> findAll() {
		
		return productRepository.findAll();
	}

}
