package org.tracking.money.api;

import org.tracking.money.model.Stock;

public interface StockFeed {

	public Stock getStockInfo(String tickerName, String exchange);
	
}
