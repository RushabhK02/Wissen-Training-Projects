package com.bank.mts.service;

import com.bank.mts.repository.AccountRepository;

public interface TxrService {
	void setAccountRepository(AccountRepository accountRepository);
	void txr(double amount, String fromAcc, String toAcc);
}
