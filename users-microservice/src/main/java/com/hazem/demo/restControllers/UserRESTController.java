package com.hazem.demo.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hazem.demo.entities.User;
import com.hazem.demo.service.UserService;



@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {
	@Autowired
	UserService userServ;

	@RequestMapping(path = "all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userServ.findAllUsers();
	}

}