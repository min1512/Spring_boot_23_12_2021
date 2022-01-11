package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.MemberForm;

@Controller
public class MemberController {
  
  @GetMapping("/login")
  public String LoginForm(@ModelAttribute MemberForm memberForm ) {
	  return "login";
  }
  
  @PostMapping("/login")
  public String login(@ModelAttribute @Validated MemberForm memberForm, BindingResult bindingResult,
		  @RequestParam(defaultValue = "/") String redirectURL ) {
	  if(bindingResult.hasErrors()) {
		  return "login/loginForm";
	  }
	  
	  return "";
  }
  
}
