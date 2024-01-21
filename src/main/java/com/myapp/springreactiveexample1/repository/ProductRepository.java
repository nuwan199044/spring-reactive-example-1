package com.myapp.springreactiveexample1.repository;

import com.myapp.springreactiveexample1.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
}
