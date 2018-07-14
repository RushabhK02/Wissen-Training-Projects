package com.bank.mts.service;

import java.util.Date;

import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.TransactionRepository;

public interface TxrService {
	public void setAccountRepository(AccountRepository accountRepository);
	public void setTransactionRepository(TransactionRepository transactionRepository);
	void txr(double amount, String fromAccNum, String toAccNum);
	public void getBankStatement(Date fromDate,Date toDate, String accID);
}
