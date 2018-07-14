package com.bank.mts.service;

import java.util.Date;

import org.springframework.transaction.annotation.Transactional;

import com.bank.mts.model.Account;
import com.bank.mts.model.Txn;
import com.bank.mts.model.TxnType;
import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.TxnRepopository;

public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;
	private TxnRepopository txnRepopository;

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public void setTxnRepopository(TxnRepopository txnRepopository) {
		this.txnRepopository = txnRepopository;
	}

	@Transactional
	public void txr(double amount, String fromAccNum, String toAccNum) {
		try {

			Account fromAccount = accountRepository.load(fromAccNum);
			Account toAccount = accountRepository.load(toAccNum);

			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);

			fromAccount = accountRepository.update(fromAccount);
			boolean b = false;
			if (b)
				throw new RuntimeException();
			toAccount = accountRepository.update(toAccount);

			Txn debitTxn = new Txn();
			debitTxn.setAmount(amount);
			debitTxn.setType(TxnType.DEBIT);
			debitTxn.setDate(new Date());
			debitTxn.setClosingBalance(fromAccount.getBalance());
			debitTxn.setAccount(fromAccount);

			Txn creditTxn = new Txn();
			creditTxn.setAmount(amount);
			creditTxn.setType(TxnType.CREDIT);
			creditTxn.setDate(new Date());
			creditTxn.setClosingBalance(toAccount.getBalance());
			creditTxn.setAccount(toAccount);

			txnRepopository.save(debitTxn);
			txnRepopository.save(creditTxn);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
