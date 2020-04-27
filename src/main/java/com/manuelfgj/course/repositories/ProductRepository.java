package com.manuelfgj.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manuelfgj.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
