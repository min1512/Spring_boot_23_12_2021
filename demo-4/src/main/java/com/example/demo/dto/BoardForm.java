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

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}	
	
}
