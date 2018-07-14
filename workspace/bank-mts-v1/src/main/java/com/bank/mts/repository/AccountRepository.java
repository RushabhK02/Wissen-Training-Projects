package com.bank.mts.repository;

import com.bank.mts.model.Account;

public interface AccountRepository {
	public Account load(String num);
	public void update(Account account);
	
}
