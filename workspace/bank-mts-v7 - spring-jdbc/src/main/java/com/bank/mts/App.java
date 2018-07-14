package com.bank.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.mts.config.Bank_mts;
import com.bank.mts.service.TxrService;

public class App {

	public static void main(String[] args) {

		// Init phase
		// -----------------------------------------
		ConfigurableApplicationContext context = null; // container
		context = new AnnotationConfigApplicationContext(Bank_mts.class);
		// -----------------------------------------

		System.out.println("-----------------------------------------");

		// use phase
		// -----------------------------------------
		TxrService txrService = context.getBean("txrService", TxrService.class);
		txrService.txr(300.00, "1", "2");

		// -----------------------------------------

		System.out.println("-----------------------------------------");

		// destroy phase
		// -----------------------------------------
		context.close();
		// -----------------------------------------

	}

}
