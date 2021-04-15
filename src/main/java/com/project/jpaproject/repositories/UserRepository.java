package com.project.jpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.jpaproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
