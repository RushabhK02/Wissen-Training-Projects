package com.shopping.txns.repository;

import java.util.List;

import com.shopping.txns.model.Txn;

public interface TxnRepository {
	void save(Txn txn);

	List<Txn> findAll();
}
