package com.myproject.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.myproject.ecommerce.entity.Product;

//accept calls from web browser scripts this origin

//origin is more than the hostname
//Origin -> protocol+hostname+port

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
