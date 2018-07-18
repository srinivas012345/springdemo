package com.srini.tech.SpringMVCDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/resource")
public class Resource {

	public Resource() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/name")
	public String getName(){
		return "Srinivasa Rao Neduri";
	}

}
