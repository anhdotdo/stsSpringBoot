package com.skillsoft.springbootrestclient_v2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillsoft.springbootrestclient_v2.model.Product;
import com.skillsoft.springbootrestclient_v2.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{pId}")
	public Product getProduct(@PathVariable("pId") String id) {
		return productService.getSpecificProduct(id);
	}
	
	@PostMapping("/products")
	public void postProduct(@RequestBody Product product) {
		productService.postSpecificProduct(product);
	}
	
	@PutMapping("/products/{pId}")
	public void putProduct(@RequestBody Product product, @PathVariable("pId") String id) {
		productService.putSpecificProduct(id, product);
	}
	
	@DeleteMapping("/products/{pId}")
	public void deleteProduct(@PathVariable("pId") String id) {
		productService.deleteSpecificProduct(id);
	}
}
