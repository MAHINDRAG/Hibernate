package com.app;

public class Answer {
	private int id;
	private String answerName;
	private String postedby;
	private Question parentobjects;
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
	public Question getParentobjects() {
		return parentobjects;
	}
	public void setParentobjects(Question parentobjects) {
		this.parentobjects = parentobjects;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answerName=" + answerName
				+ ", postedby=" + postedby + ", parentobjects=" + parentobjects
				+ "]";
	}
	

}
