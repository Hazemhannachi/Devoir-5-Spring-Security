package com.hazem.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hazem.demo.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Role findByRole(String role);
}