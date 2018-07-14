package com.bank.mts.service;

import org.apache.log4j.Logger;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	AccountRepository accountRepository;
	private static Logger logger = Logger.getLogger("mts");
	
	public TxrServiceImpl() {
		logger.info("TxrService instance created..");
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		// TODO Auto-generated method stub
		logger.info("AccountRepository instance injected into TxrService");
		this.accountRepository = accountRepository;
		
	}

	public void txr(double amount, String fromAcc, String toAcc) {
		logger.info("txr-initiated");
		try {
			// load accounts
			Account fromAccount = accountRepository.load(fromAcc);
			Account toAccount = accountRepository.load(toAcc);
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
