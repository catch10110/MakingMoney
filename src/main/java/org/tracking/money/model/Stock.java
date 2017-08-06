package org.tracking.money.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Stock {
	private String name;
	private String ticker;
	private String exchange;
	
	@XmlElement(name = "bidPrice") private float bidPrice;
	@XmlElement(name = "askPrice") private float askPrice;
	@XmlElement(name = "closePrice") private float closePrice;
	
	public Stock() {
		;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public float getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(String bidPrice) {
		if (bidPrice.equals("N/A")) {
			this.bidPrice = - 1;
		} else {
			this.bidPrice = Float.valueOf(bidPrice);
		}
	}
	public float getAskPrice() {
		return askPrice;
	}
	public void setAskPrice(String askPrice) {
		if (askPrice.equals("N/A")) {
			this.askPrice = - 1;
		} else {
			this.askPrice = Float.valueOf(askPrice);
		}
	}
	public float getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(String closePrice) {
		if (closePrice.equals("N/A")) {
			this.closePrice = - 1;
		} else {
			this.closePrice = Float.valueOf(closePrice);
		}
	}
	
	
}
