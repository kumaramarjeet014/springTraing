package com.bvr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints2 {

	public MyEndPoints2() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retrieveAll(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable Integer id){
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user){
		User savedUser = service.save(user);
	}

}
