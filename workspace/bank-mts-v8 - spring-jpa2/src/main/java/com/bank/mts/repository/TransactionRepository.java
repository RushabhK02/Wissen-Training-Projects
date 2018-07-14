package com.bank.mts.repository;

import java.util.Date;

import com.bank.mts.model.Account;

public interface TransactionRepository {
	public void get(Date fromDate,Date toDate, String AccID);
	public void add(Account fromAccount, Account toAccount,double amount);
}
