package com.project.jpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.jpaproject.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
