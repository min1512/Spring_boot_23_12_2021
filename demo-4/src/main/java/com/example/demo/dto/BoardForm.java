package com.example.demo.dto;


public class BoardForm {
	private String boardTitle;
	private String boardContent;
	private String user;
	
	public  BoardForm(String boardTitle, String boardContent, String user) {
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "BoardForm{" +
				"title='" + boardTitle + '\'' +
				", content='" + boardContent + '\'' +
				", user='" + user + '\'' +
				'}';
	}

	

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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
