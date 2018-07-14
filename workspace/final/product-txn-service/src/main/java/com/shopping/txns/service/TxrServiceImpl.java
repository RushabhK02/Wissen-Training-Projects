package com.shopping.txns.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.txns.model.Account;
import com.shopping.txns.model.Txn;
import com.shopping.txns.model.TxnType;
import com.shopping.txns.repository.AccountRepository;
import com.shopping.txns.repository.TxnRepository;
import com.shopping.txns.web.TxnResponse;

@Service
public class TxrServiceImpl implements TxrService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TxnRepository txnRepository;

	@Transactional
	public TxnResponse txr(double amount, String fromAccNum, String toAccNum) {
		try {

			Account fromAccount = accountRepository.load(fromAccNum);
			Account toAccount = accountRepository.load(toAccNum);

			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);

			fromAccount = accountRepository.update(fromAccount);
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

			txnRepository.save(debitTxn);
			txnRepository.save(creditTxn);
			return TxnResponse.SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return TxnResponse.FAILURE;
		}
	}

}
