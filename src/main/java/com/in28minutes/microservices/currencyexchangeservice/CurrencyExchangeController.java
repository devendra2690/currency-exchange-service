package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	org.springframework.core.env.Environment env;
	
	@Autowired
	CurrencyExchangeRepository currencyExchangeRepository;
	
    @GetMapping("/currency-exchnage/{from}/to/{to}")
	public CurrencyExchange getExChangeRate(@PathVariable("from") String from, @PathVariable("to") String to) {
		
    	CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromCurrencyAndToCurrency(from, to);
    	currencyExchange.setServerPort(Integer.parseInt(env.getProperty("local.server.port")));
		
    	return currencyExchange;
	}
}
