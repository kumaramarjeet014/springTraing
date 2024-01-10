package com.bvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints {
	
	@RequestMapping("/mypage")
	public String myString() {
		return "First Microservices Example - updated";
	}
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Welcome " + name;
	}
	
	@RequestMapping("/secondPathVar/{name}")
	public String sayHelloPathVar(@PathVariable String name) {
		return "Welcome " + name;
	}
	
	@GetMapping(path = "/secondSampleBean")
	public SecondSampleBean secondSampleBean () {
		return new SecondSampleBean("Hello SampleBean");
	}

}
