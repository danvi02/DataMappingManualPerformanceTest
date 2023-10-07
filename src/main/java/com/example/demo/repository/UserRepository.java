package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.User;

public class UserRepository {
	public static List<User> generateUsers(int size) {
		List<User> users = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			User user = new User();
			user.setEmail("Email " + i);
			user.setMobileNumber("Mobile " + i);
			users.add(user);
		}
		return users;
	}
}
