package com.shopping.txns.repository;

import java.util.List;

import com.shopping.txns.model.Account;

public interface AccountRepository {

	Account load(String num);

	Account update(Account account);
	
	List<Account> findAll();

}
