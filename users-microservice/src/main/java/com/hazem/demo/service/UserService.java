package com.hazem.demo.service;

import java.util.List;

import com.hazem.demo.entities.Role;
import com.hazem.demo.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
List<User> findAllUsers();
}