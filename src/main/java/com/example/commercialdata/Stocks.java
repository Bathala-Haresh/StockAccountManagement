package com.example.commercialdata;

public class Stocks {
	//properties
	private String shareName;
	private double sharePrice;
	private int shareCount;
	private String symbol;
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	//generating getters and setters
	public String getShareName() {
		return shareName;
	}
	
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	
	public double getSharePrice() {
		return sharePrice;
	}
	
	public void setSharePrice(double sharePrice) {
		if (sharePrice < 0.0) {
			System.err.println("Price cannot be zero");
		}
		else {
		this.sharePrice = sharePrice;
		}
	}
	
	public int getShareCount() {
		return shareCount;
	}
	
	public int setShareCount(int shareCount) {
		if (shareCount < 0.0) {
			System.err.println("Share cannot be zero");
		}
		else {
		this.shareCount = shareCount;
		}
		return shareCount;
	}

	@Override
	public String toString() {
		return "Stocks [shareName=" + shareName + ", sharePrice=" + sharePrice + ", shareCount=" + shareCount + "]";
	}
	
	
	
}