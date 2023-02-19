package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.example.demo.Repository.UserRepository;
import com.example.demo.model.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/hello")
	public String firstPage() {
		return "Hello World";
	}
	
	@GetMapping("/std")
    public List <User> findAl() {
        return repo.findAll();
	}
	
	@PostMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody User u) {
        repo.save(u);
    }
	
	
	
}
