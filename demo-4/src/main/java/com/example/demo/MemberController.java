package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.MemberForm;
import com.example.demo.service.MemberService;

@Controller
public class MemberController {
  
	  @Autowired
	  private MemberService memberservice;
		
	  @GetMapping("/login")
	  public String LoginForm(@ModelAttribute MemberForm memberForm ) {
		  return "login";
	  }  
	  
	  @PostMapping("/login")
	  public String login(MemberForm form) {
	  
		  memberservice.validationLogin(form.getMemberid(), form.getMemberpw());
	  	  
		  return "redirect:/login";
	  }
	  
	  @GetMapping("/signup")
	  public String SignUpForm(@ModelAttribute MemberForm memberForm ) {
		  return "signup";
	  }
	  
	  @PostMapping("/signup")
	  public String signup(MemberForm form) {
		  memberservice.insertMembers(form);
		  return "redirect:/login";
	  }
  
}
