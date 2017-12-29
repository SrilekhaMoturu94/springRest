package com.mtc.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.entity.Product;
import com.mtc.app.repository.IProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private IProductRepository iproductRepository;
	
	@GetMapping(value="/product/{id}",produces="application/json")
	public @ResponseBody ResponseEntity<Product> fetchProductById(@PathVariable("id") Integer id) {
				
		Product product = iproductRepository.findOne(id);
		
		System.out.println("Id   : "+product.getId());
		System.out.println("Name : "+product.getName());
		
		
		ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(product,HttpStatus.OK);
		
		return responseEntity;
	}
	

}
