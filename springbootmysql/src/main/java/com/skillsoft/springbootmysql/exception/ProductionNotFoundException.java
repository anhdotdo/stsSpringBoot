package com.skillsoft.springbootmysql.exception;

public class ProductionNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ProductionNotFoundException(Long id) {
		super("The product with" + id + "can not be found");
	}
}
