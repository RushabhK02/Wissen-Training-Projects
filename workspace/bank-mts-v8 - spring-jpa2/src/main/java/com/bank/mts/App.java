package com.bank.mts;

import java.util.Date;
import java.util.concurrent.TimeUnit;

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

		// use phase
		// -----------------------------------------
		Date fromDate=new Date();
		try {
			TxrService txrService = context.getBean("txrService", TxrService.class);
			txrService.txr(1000.00, "1", "2");
			TimeUnit.SECONDS.sleep(5);
			Date toDate=new Date();
			txrService.getBankStatement(fromDate, toDate, "1");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Txr Failed..");
		}
		// -----------------------------------------

		// destroy phase
		// -----------------------------------------
		context.close();
		// -----------------------------------------

	}

}
