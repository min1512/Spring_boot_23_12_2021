package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ArticleForm;

@Controller
public class ArticleController {	
	
	@GetMapping("/articles/new")
	public String newArticleForm(Model model) {		
		return "articles/new";
	}
	
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
		System.out.println(form);
		return "";
	}
}
