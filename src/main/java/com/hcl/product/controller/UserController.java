package com.hcl.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.product.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<String>> getAllUsers() {
		return new ResponseEntity<List<String>>(userService.getUsers(),HttpStatus.OK);
	}
}
