package com.bank.mts.service;

import java.util.Date;

import org.springframework.transaction.annotation.Transactional;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.TransactionRepository;

public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;
	private TransactionRepository transactionRepository;
	
	public TxrServiceImpl() {
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public void setTransactionRepository(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}
	
	@Transactional
	public void txr(double amount, String fromAccNum, String toAccNum) {
	
			Account fromAccount = accountRepository.load(fromAccNum);
			Account toAccount = accountRepository.load(toAccNum);

			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);

			accountRepository.update(fromAccount);
			accountRepository.update(toAccount);
			System.out.println("----------");
			transactionRepository.add(fromAccount, toAccount, amount);
		
	}
	@Transactional
	public void getBankStatement(Date fromDate,Date toDate, String accID) {
		transactionRepository.get(fromDate, toDate, accID);
	}

}
