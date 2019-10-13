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

	
	public CurrencyExchange(int id, String fromCurrency, String toCurrency, int exchangeRate, int serverPort) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.exchangeRate = exchangeRate;
		this.serverPort = serverPort;
	}

	//Need this default constructor when working with JPA	
	// Error : org.hibernate.InstantiationException: No default constructor for entity:  : com.in28minutes.microservices.currencyexchangeservice.CurrencyExchange
	public CurrencyExchange() {
	
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public int getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(int exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
				+ ", exchangeRate=" + exchangeRate + ", serverPort=" + serverPort + "]";
	}
		
}
