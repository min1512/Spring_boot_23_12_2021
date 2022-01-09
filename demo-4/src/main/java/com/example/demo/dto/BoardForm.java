package com.example.demo.dto;


public class BoardForm {
	private String boardTitle;
	private String boardContent;
	
	public  BoardForm(String boardTitle, String boardContent) {
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
	}
	
	@Override
	public String toString() {
		return "BoardForm{" +
				"title='" + boardTitle + '\'' +
				", content='" + boardContent + '\'' +
				'}';
	}	
	
}
