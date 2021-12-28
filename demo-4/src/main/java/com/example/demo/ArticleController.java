package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ArticleForm;
import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;

@Controller
public class ArticleController {	
	
	@Autowired // 스프링 부트가  미리 생성해 놓은 객체를 가져다가 자동 연결!
	private ArticleRepository articleRepository;
	
	@GetMapping("/articles/new")
	public String newArticleForm(Model model) {		
		return "articles/new";
	}
	
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
		System.out.println(form);
		
		//1. Dto를 변환! Entity!
		Article article = form.toEntity();
		System.out.println(article.toString());
		
		//2. Repository에게 Entity를 DB안에 저장하게 함!
		Article saved = articleRepository.save(article);
		System.out.println(saved.toString());
		
		return "";
	}
}
