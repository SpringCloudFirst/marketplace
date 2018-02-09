package com.hcl.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UserService {

	public List<String> getUsers(){
		ArrayList<String> users = new ArrayList<String>();
		users.add("Andrew");
		users.add("Semon");
		users.add("Clark");
		users.add("John");
		return users;
	}
}
