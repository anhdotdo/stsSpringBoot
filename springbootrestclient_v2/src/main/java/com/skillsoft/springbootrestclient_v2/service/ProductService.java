package com.skillsoft.springbootrestclient_v2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.skillsoft.springbootrestclient_v2.model.Product;

@Service
public class ProductService {
	private List<Product> products = new ArrayList<>(Arrays.asList(
			new Product("p100", "vo", "van phong pham"),
			new Product("p101", "but", "van phong pham"),
			new Product("p102", "may tinh", "dien tu"),
			new Product("p103", "giay", "thoi trang")
			));
	public List<Product> getAllProducts(){
		return products;
	}
	
	public Product getSpecificProduct(String id) {
		return products.stream().filter(p->p.getId().equals(id)).findFirst().get();
	}
	public void postSpecificProduct(Product product) {
		products.add(product);
	}
	
	public void putSpecificProduct(String id, Product product) {
		for (int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			if(p.getId().equals(id)) {
				products.set(i, product);
				return;
			}
		}
	}
	
	public void deleteSpecificProduct(String id) {
		products.removeIf(p->p.getId().equals(id));
	}
}
