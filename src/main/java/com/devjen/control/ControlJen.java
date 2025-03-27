package com.devjen.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class ControlJen {

	@GetMapping(value = "/get")
	public String getVal() {
		return "Move Ahead";
	}
	
	@GetMapping(value = "getAll/{a}")
	public String getDin(@PathVariable String a) {
		return "My name is " + a;
	}
}
