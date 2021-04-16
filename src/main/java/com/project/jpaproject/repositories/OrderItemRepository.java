package com.project.jpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.jpaproject.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
