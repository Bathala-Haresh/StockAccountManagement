package com.example.commercialdata;
import java.util.LinkedList;

public class StockAccountManagementImpl implements StockAccountManagement{

	LinkedList<Stocks> sharesList = new LinkedList<Stocks>();

	//method to Add Stocks
	@Override
	public void addStocks(Stocks share) {
		if (sharesList.contains(share)) {
			System.err.println("Inventory Item Exists");
		}
		else
		{
			sharesList.add(share);
		}

	}

	//method to get details of stocks/shares
	@Override
	public void getStockDetails() {
		for (Stocks stocks : sharesList) {
			System.out.println(stocks);
		}		
	}

	//method to calculate values
	@Override
	public void calculateShareValue() {
		double totalvalue = 0;
		for (Stocks stocks : sharesList) {
			double value = stocks.getShareCount() *stocks.getSharePrice();
			System.out.println("Value of "+stocks.getShareName()+" is "+value);
			totalvalue = totalvalue + value;
		}

	}

	@Override
	public void removeStock(String shareName) {
		for (Stocks stocks : sharesList) {
			if(stocks.getShareName().equals(shareName))	{
				stocks.setShareCount(0);
				stocks.setShareName(null);
				stocks.setSharePrice(0);

			}		
		}

	}

	@Override
	public void sellStocks(String shareName,int count) {
		for(Stocks stocks : sharesList)
		{
			if(stocks.getShareName().equals(shareName)) {
				int number=stocks.getShareCount()+count;
				stocks.setShareCount(number);
			}
		}
	}

	@Override
	public void buyStocks(String shareName,int count) {
		for (Stocks stocks : sharesList) {
			if(stocks.getShareName().equals(shareName))	{
				double value=(double)stocks.getSharePrice() * count;
				System.out.println("The" + shareName+"total price is : "+value);
				int stockCount=stocks.getShareCount()-count;
				stocks.setShareCount(stockCount);
			}
		}
	}
}