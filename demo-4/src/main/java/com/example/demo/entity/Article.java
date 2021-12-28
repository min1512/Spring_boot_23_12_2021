package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {
	
	@Id //대표값을 지정! 사람으로 따지면 주민등록번호 같은것
	@GeneratedValue //1,2,3... 자동 생성 어노테이션!
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String content;
	
	public  Article(Long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Article{" +
				"id='" + id + '\'' +
				"title='" + title + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
