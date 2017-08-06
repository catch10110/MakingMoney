package org.tracking.money.service;

import org.tracking.money.api.StockFeed;
import org.tracking.money.api.YahooFinanceApi;
import org.tracking.money.model.Stock;

public class TickerService {

	private static final String YAHOO_BASE = "http://finance.yahoo.com/d/quotes.csv";
	
	StockFeed sfeed = YahooFinanceApi.getInstance();
	
	public TickerService() {
		;
	}
	
	public Stock getTickerInfo(String tickerName) {
		return sfeed.getStockInfo(tickerName, null);
	}
	
//	public String getTickerInfo(String tickerName) throws ClientProtocolException, IOException {
//		HttpResponse response = getRequest(YAHOO_BASE, tickerName);
//		HttpEntity entity = response.getEntity();
//		Scanner sc = new Scanner(entity.getContent());
//		StringBuilder sb = new StringBuilder();
//		while(sc.hasNext()) {
//			sb.append(sc.next());
//		}
//		return sb.toString();
//	}
//	
//	public static final HttpClient httpClient = HttpClientBuilder.create().build();
//	
//	public static HttpResponse getRequest(String base, String tickerName) throws ClientProtocolException, IOException {
//		HttpGet getRequest = new HttpGet(base + "?s=" + tickerName + "&f=nabp");
//		//getRequest.setHeader("Content-type", "application/json");
//		HttpResponse response = httpClient.execute(getRequest);
//		return response;
//	}
}
