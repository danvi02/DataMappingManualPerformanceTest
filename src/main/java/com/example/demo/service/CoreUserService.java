package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

@Service
public class CoreUserService {

	public List<UserDTO> convertEntityToDTO(List<User> users) {
        return users.stream()
		        .map(user -> {
		        	UserDTO userDto = new UserDTO();
		        	userDto.setEmail(user.getEmail());
		        	userDto.setMobileNumber(user.getMobileNumber());
		        	return userDto;
		        })
		        .collect(Collectors.toList());

    }
}
