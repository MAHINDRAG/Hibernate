package com.app;

public class Developer extends Employee {
private int techId;
private String techName;
private int exp;
public void setTechid(int techId){
	this.techId=techId;
	
}
public int getTechId(){
	return techId;
	
}
public String getTechName() {
	return techName;
}
public void setTechName(String techName) {
	this.techName = techName;
}
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}
public void setTechId(int techId) {
	this.techId = techId;
}

}
