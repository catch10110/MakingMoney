package org.tracking.money.api;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.tracking.money.dao.StockDao;
import org.tracking.money.dao.impl.mock.StockDaoImpl;
import org.tracking.money.model.Stock;
import org.tracking.money.util.RestHelper;

public class YahooFinanceApi implements StockFeed {
	
	private static final YahooFinanceApi instance = new YahooFinanceApi();
	
	private static final String YAHOO_BASE = "http://finance.yahoo.com/d/quotes.csv?s=";
	private static final String YAHOO_PARAM_NAME = "?s=";
	private static final String YAHOO_INFO_SUFFIX = "&f=";
	private static final String YAHOO_INFO = "nabp";
	
	StockDao stockDao = new StockDaoImpl();
	
	private YahooFinanceApi() {
		;
	}
	
	public Stock getStockInfo(String tickerName, String exchange) {
		Stock stock = new Stock();
		HttpGet getRequest = new HttpGet(YAHOO_BASE + tickerName + YAHOO_INFO_SUFFIX + YAHOO_INFO);
		try {
			HttpResponse response = RestHelper.getRequest("", getRequest);
			Scanner sc = new Scanner(response.getEntity().getContent());
			StringBuilder sb = new StringBuilder();
			while (sc.hasNext()) {
				sb.append(sc.next());
			}

			String[] stockValues = sb.toString().replaceAll("[\r\n\"]", "").split(",");
			
			stock.setName(stockValues[0]);
			stock.setAskPrice(stockValues[1]);
			stock.setBidPrice(stockValues[2]);
			stock.setClosePrice(stockValues[3]);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		stockDao.addStock(stock);
		
		return stock;
	}

	public static YahooFinanceApi getInstance() {
		return instance;
	}
	
}
