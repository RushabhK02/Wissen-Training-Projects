package com.bank.mts.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import java.util.Date;
import java.util.List;

import com.bank.mts.model.Account;
import com.bank.mts.model.Transaction;
import com.bank.mts.model.TransactionType;

public class JpaTransactionRepository implements TransactionRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void add(Account fromAcc,Account toAcc,double amount) {
		Transaction creditTransaction=new Transaction();
		Transaction debitTransaction=new Transaction();
		
		creditTransaction.setAccount(toAcc);
		creditTransaction.setAmount(amount);
		creditTransaction.setClosingBalance(toAcc.getBalance());
		creditTransaction.setDate(new Date());
		creditTransaction.setType(TransactionType.CREDIT);
		creditTransaction.setDescription("Taking money to "+fromAcc.getNum());
		
		debitTransaction.setAccount(fromAcc);
		debitTransaction.setAmount(amount);
		debitTransaction.setClosingBalance(fromAcc.getBalance());
		debitTransaction.setDate(new Date());
		debitTransaction.setType(TransactionType.DEBIT);
		debitTransaction.setDescription("Giving money to "+toAcc.getNum());
		
		entityManager.persist(creditTransaction);
		entityManager.persist(debitTransaction);
		
	}

	@Override
	public void get(Date fromDate, Date toDate, String AccID) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("from Transaction tr where tr.account.num=:AccId and tr.date between :fromDate and :toDate");
		
		query.setParameter("AccId", AccID);
		query.setParameter("fromDate", fromDate,TemporalType.TIMESTAMP);
		query.setParameter("toDate", toDate,TemporalType.TIMESTAMP);
		List<Transaction> txns = query.getResultList();
		for (Transaction txn : txns) {
			System.out.println(txn);
		}
	}
}
