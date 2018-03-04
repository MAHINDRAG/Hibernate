package com.app;

public class Manager extends Employee{
private int projId;
private String projName;
public int getProjId() {
	return projId;
}
public void setProjId(int projId) {
	this.projId = projId;
}
public String getProjName() {
	return projName;
}
public void setProjName(String projName) {
	this.projName = projName;
}
@Override
public String toString() {
	return "Manager [projId=" + projId + ", projName=" + projName + "]";
}

}
