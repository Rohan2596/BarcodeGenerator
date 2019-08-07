package com.example.barCodeGenerator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.barCodeGenerator.model.Product;

@Repository
public interface ProductRepository  extends CrudRepository<Product,Long> {

	
}
