package com.skillsoft.springbootmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.skillsoft.springbootmysql.model.Product;
import com.skillsoft.springbootmysql.repository.ProductRepository;

@SpringBootApplication
@EnableCaching
public class SpringbootmysqlApplication implements CommandLineRunner {
	@Autowired 
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootmysqlApplication.class, args);
		System.out.println("Hello world!");
	}

	@Override 
	public void run(String...args) throws Exception{
		productRepository.save(new Product("television", "electronics"));
		productRepository.save(new Product("air conditioner", "electronics"));
		productRepository.save(new Product("cooker", "electronics"));
		productRepository.save(new Product("scraf", "fashion"));
		productRepository.save(new Product("boots", "fashion"));
	}
}
