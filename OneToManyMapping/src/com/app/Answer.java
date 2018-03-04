package com.app;

public class Answer {
	
	private int id;
	private String answerName;
	private String postedby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public String getPostedby() {
		return postedby;
	}
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answerName=" + answerName
				+ ", postedby=" + postedby + "]";
	}
	
	
}
