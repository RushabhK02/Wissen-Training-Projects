package com.bank.mts.service;

import org.springframework.transaction.annotation.Transactional;

import com.bank.mts.model.Account;
import com.bank.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;

	public TxrServiceImpl() {
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Transactional
	public void txr(double amount, String fromAccNum, String toAccNum) {
		try {

			Account fromAccount = accountRepository.load(fromAccNum);
			Account toAccount = accountRepository.load(toAccNum);

			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);

			accountRepository.update(fromAccount);
			boolean b = false;
			if (b)
				throw new RuntimeException();
			accountRepository.update(toAccount);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
