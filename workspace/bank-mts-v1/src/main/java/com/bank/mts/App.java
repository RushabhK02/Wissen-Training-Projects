package com.bank.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.mts.service.TxrService;

public class App {
	
	public static void main(String[] args) {
		// Init phase
		ConfigurableApplicationContext context = null; 
		context = new ClassPathXmlApplicationContext("bank-mts.xml");
		
		
		// use phase
		TxrService service = context.getBean(TxrService.class);
		service.txr(300.00, "1", "2");
		
		// destroy phase
		context.close();
		
	}
}
