package com.example.demo.api;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.CoreUserService;
import com.example.demo.service.MapStructUserService;
import com.example.demo.service.ModelMapperUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final ModelMapperUserService modelMapperUserService;
	private final MapStructUserService mapStructUserService;
	private final CoreUserService coreUserService;

	@GetMapping("/java")
	public String javaPerformanceTest() {
		Instant start = Instant.now();
		// Generating a large data set with C performance testing
		List<User> users = UserRepository.generateUsers(10000000);
		this.coreUserService.convertEntityToDTO(users);
		return "Plain Java Conversion Time: " + Duration.between(start, Instant.now()).toMillis() + " ms";
	}

	@GetMapping("/modelmapper")
	public String modelMapperPerformanceTest() {
		Instant start = Instant.now();
		// Generating a large data set for performance testing
		List<User> users = UserRepository.generateUsers(10000000);
		modelMapperUserService.convertEntityToDTO(users);
		return "ModelMapper conversion Time: " + Duration.between(start, Instant.now()).toMillis() + " ms";
	}

	@GetMapping("/mapstruct")
	public String mapStructPerformanceTest() {
		Instant start = Instant.now();
		// Generating a large data set for performance testing
		List<User> users = UserRepository.generateUsers(10000000);
		mapStructUserService.convertEntityToDTO(users);
		return "MapStruct conversion Time: " + Duration.between(start, Instant.now()).toMillis() + " ms";
	}
}