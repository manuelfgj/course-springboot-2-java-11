package com.manuelfgj.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manuelfgj.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
