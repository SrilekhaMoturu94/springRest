package com.mtc.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.mtc.app.entity.Product;

public interface IProductRepository extends CrudRepository<Product,Integer>{

}
