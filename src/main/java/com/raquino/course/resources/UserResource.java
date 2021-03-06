package com.raquino.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raquino.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u1 = new User((long) 1, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		
		return ResponseEntity.ok().body(u1);
				
	}

}
