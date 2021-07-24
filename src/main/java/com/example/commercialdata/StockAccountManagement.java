package com.example.commercialdata;

import com.example.commercialdata.Stocks;

public interface StockAccountManagement {

	public void addStocks(Stocks share);
	public void getStockDetails();
	public void calculateShareValue();
	public void removeStock(String name);
	public void sellStocks(String shareName,int count);
	public void buyStocks(String shareName,int count);
}