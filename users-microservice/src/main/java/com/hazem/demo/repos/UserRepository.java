package com.hazem.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hazem.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}