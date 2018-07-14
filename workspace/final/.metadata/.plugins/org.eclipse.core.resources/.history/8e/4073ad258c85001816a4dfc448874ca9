package com.bank.mts.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bank.mts.model.Account;

public class AccountRepositoryImpl implements AccountRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Account load(String num) {
		return entityManager.find(Account.class, num);
	}

	@Override
	public Account update(Account account) {
		return entityManager.merge(account);
	}

}
