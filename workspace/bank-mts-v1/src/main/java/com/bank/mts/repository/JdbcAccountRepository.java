package com.bank.mts.repository;

import org.apache.log4j.Logger;

import com.bank.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("mts");
	
	public JdbcAccountRepository() {
		logger.info("JdbcAccountRepository instance created..");
	}
	
	public Account load(String num) {
		
		logger.info("loading account : " + num);
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Account account) {
		// TODO Auto-generated method stub
		logger.info("updating an account");
	}
	
}
