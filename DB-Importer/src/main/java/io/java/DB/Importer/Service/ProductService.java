package io.java.DB.Importer.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.DB.Importer.Repository.ProductRepository;



@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public Object getAll() {
		return productRepository.getAllProducts();
	}
	

}
