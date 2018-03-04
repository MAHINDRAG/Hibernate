package com.app.cascade;

import java.util.Date;

public class StockDailyRecords {
	
	private Integer recordId;
	private Float priceOpen;
	private Float priceClose;
	private Float priceChange;
	private Long volume;
	private Date date;
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Float getPriceOpen() {
		return priceOpen;
	}
	public void setPriceOpen(Float priceOpen) {
		this.priceOpen = priceOpen;
	}
	public Float getPriceClose() {
		return priceClose;
	}
	public void setPriceClose(Float priceClose) {
		this.priceClose = priceClose;
	}
	public Float getPriceChange() {
		return priceChange;
	}
	public void setPriceChange(Float priceChange) {
		this.priceChange = priceChange;
	}
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "StockDailyRecords [recordId=" + recordId + ", priceOpen=" + priceOpen + ", priceClose=" + priceClose
				+ ", priceChange=" + priceChange + ", volume=" + volume + ", date=" + date + "]";
	}
	

}
