package com.bvr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndpoint3 {

	public MyEndpoint3() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	ExampleProperties props;
	
	@RequestMapping("/greetOthers")
	public String greet(@RequestParam String details) {
		return props.getGreeting() + details;
	}

}
