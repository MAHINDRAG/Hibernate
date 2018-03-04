package com.app.cascade;

import java.util.Set;

public class Stock {
	
	private Integer stockId;
	private String stockCode;
	private String stockName;
	private Set<StockDailyRecords> stockDailyRecords;
	
	public Set<StockDailyRecords> getStockDailyRecords() {
		return stockDailyRecords;
	}
	public void setStockDailyRecords(Set<StockDailyRecords> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockCode=" + stockCode + ", stockName=" + stockName
				+ ", stockDailyRecords=" + stockDailyRecords + "]";
	}
	

}
