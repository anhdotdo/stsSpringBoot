package com.skillsoft.springbootmysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillsoft.springbootmysql.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
