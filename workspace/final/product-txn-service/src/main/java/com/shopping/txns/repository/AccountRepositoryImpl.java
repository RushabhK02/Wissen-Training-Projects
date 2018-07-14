package com.shopping.txns.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.txns.model.Account;

@Transactional
@Repository(value = "AccountRepo")
public class AccountRepositoryImpl implements AccountRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Account load(String num) {
		return entityManager.find(Account.class, num);
	}

	public List<Account> findAll() {
		List<Account> accounts = entityManager.createQuery("from Account").getResultList();
		return accounts;
	}

	@Override
	public Account update(Account account) {
		return entityManager.merge(account);
	}

}
