package com.bank.mts.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;
import com.bank.mts.spring.RepoQualifier;

public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("mts");

	private AccountRepository accountRepository;

	public TxrServiceImpl() {
		logger.info("TxrService instance created..");
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("AccountRepository instance injected to TxrService instance");
	}

	public void init() {
		logger.info("TxrService :: init()");
	}
	public void destroy() {
		logger.info("TxrService :: destroy()");
	}

	public void txr(double amount, String fromAccNum, String toAccNum) {
		logger.info("txr-initiated");
		try {
			// load accounts
			Account fromAccount = accountRepository.load(fromAccNum);
			Account toAccount = accountRepository.load(toAccNum);
			// debit & credit
			// ..........
			// update accounts
			accountRepository.update(fromAccount);
			accountRepository.update(toAccount);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("txr-failed");
		}
		logger.info("txr-successful");
	}

}
