package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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
	
	@GetMapping("/hi")
	public String hi(Model model) {
		model.addAttribute("username","상민");
		return "hi";
	}
	
	@GetMapping("/bye")
	public String bye(Model model) {
		model.addAttribute("username","상민");
		return "bye";
	}
}
