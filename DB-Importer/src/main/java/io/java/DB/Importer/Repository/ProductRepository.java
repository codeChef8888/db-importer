package io.java.DB.Importer.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.java.DB.Importer.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query(value ="select * from product",nativeQuery = true)
	public List<Map<String, Object>> getAllProducts();

}
