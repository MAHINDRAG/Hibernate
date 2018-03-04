package com.app;

import java.util.Set;

public class Student {
private int studentId;
private String studentName;
private int marks;
private Set<String> courses;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Set<String> getCourses() {
	return courses;
}
public void setCourses(Set<String> courses) {
	this.courses = courses;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName
			+ ", marks=" + marks + ", courses=" + courses + "]";
}

}
