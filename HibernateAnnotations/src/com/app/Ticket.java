package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tictable")
public class Ticket {
	@Id
	@Column(name="tid")
	private int ticId;
	@Column(name="tname")
	private String ticName;
	@Column(name="tsal")
	private double ticSal;
	
	public int getTicId() {
		return ticId;
	}

	public void setTicId(int ticId) {
		this.ticId = ticId;
	}

	public String getTicName() {
		return ticName;
	}

	public void setTicName(String ticName) {
		this.ticName = ticName;
	}

	public double getTicSal() {
		return ticSal;
	}

	public void setTicSal(double ticSal) {
		this.ticSal = ticSal;
	}

	@Override
	public String toString() {
		return "Ticket [ticId=" + ticId + ", ticName=" + ticName + ", ticSal="
				+ ticSal + "]";
	}
	

}
