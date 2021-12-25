package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		String msg = "Hello Spring MVC World!!";
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/login")
	public ResponseEntity<String> login() {
		String msg = "loginPage";
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/search")
	public ResponseEntity<String> search() {
		String msg = "searchPage";
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		String msg = "testPage";
		return ResponseEntity.ok(msg);
	}

}
