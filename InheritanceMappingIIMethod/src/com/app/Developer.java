package com.app;

public class Developer extends Employee{
private int techId;
private String techName;
private double exp;
public int getTechId() {
	return techId;
}
public void setTechId(int techId) {
	this.techId = techId;
}
public String getTechName() {
	return techName;
}
public void setTechName(String techName) {
	this.techName = techName;
}
public double getExp() {
	return exp;
}
public void setExp(double exp) {
	this.exp = exp;
}
@Override
public String toString() {
	return "Developer [techId=" + techId + ", techName=" + techName + ", exp="
			+ exp + "]";
}

}
