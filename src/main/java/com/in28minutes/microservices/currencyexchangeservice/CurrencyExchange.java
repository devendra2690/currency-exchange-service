package com.in28minutes.microservices.currencyexchangeservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CurrencyExchange {

	@Id
	private int id;
	private String fromCurrency;
	private String toCurrency;
	private int exchangeRate;
	
	@Transient
	private int serverPort;

	
	public CurrencyExchange(String from, String to, int exchangeRate, int serverPort) {
		super();
		this.fromCurrency = from;
		this.toCurrency = to;
		this.exchangeRate = exchangeRate;
		this.serverPort = serverPort;
	}
	
	//Need this default constructor when working with JPA	
	// Error : org.hibernate.InstantiationException: No default constructor for entity:  : com.in28minutes.microservices.currencyexchangeservice.CurrencyExchange
	public CurrencyExchange() {
	
	}





	public int getServerPort() {
		return serverPort;
	}
	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}
	public String getFrom() {
		return fromCurrency;
	}
	public void setFrom(String from) {
		this.fromCurrency = from;
	}
	public String getTo() {
		return toCurrency;
	}
	public void setTo(String to) {
		this.toCurrency = to;
	}
	public int getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(int exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	@Override
	public String toString() {
		return "CurrencyExchange [from=" + fromCurrency + ", to=" + toCurrency + ", exchangeRate=" + exchangeRate + "]";
	}
}
