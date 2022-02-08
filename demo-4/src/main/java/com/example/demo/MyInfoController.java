package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.dto.MemberForm;

@Controller
public class MyInfoController {  
		
	  @GetMapping("/myinfo")
	  public String myinfo(@ModelAttribute MemberForm memberForm) {
		  return "myinfo";
	  }
}
