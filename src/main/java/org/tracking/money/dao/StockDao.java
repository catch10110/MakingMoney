package org.tracking.money.dao;

import java.util.Collection;

import org.tracking.money.model.Stock;

public interface StockDao {

	public Collection<Stock> listOfStock();
	
	public Stock getStock(String tickerName, String exhange);
	
	public Stock addStock(Stock stock);
	
	public Stock updateStock(Stock stock);
	
	public boolean deleteStock(String tickerName);
}
