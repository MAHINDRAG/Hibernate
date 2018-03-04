package com.app;

import java.util.Set;

public class Courses {
private int courseId;
private String courseName;
private int duration;
private Set<String> students;

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public Set<String> getStudents() {
	return students;
}

public void setStudents(Set<String> students) {
	this.students = students;
}

@Override
public String toString() {
	return "Courses [courseId=" + courseId + ", courseName=" + courseName
			+ ", duration=" + duration + ", students=" + students + "]";
}

}
