package com.shopping.txns.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.txns.model.Account;
import com.shopping.txns.model.Txn;
import com.shopping.txns.repository.AccountRepository;
import com.shopping.txns.repository.TxnRepository;
import com.shopping.txns.service.TxrService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/api/product-txn")
public class TxrController {

	@Autowired
	private TxrService txrService;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TxnRepository txnRepository;
	
	@PostMapping(consumes="application/json",produces = "application/json")
	protected TxnResponse doPost(@RequestBody TxnDetails txnDetails){
		// input
		String fromAccNum = txnDetails.getFromAccount();
		String toAccNum = txnDetails.getToAccount();
		String amount =  txnDetails.getAmount();
		// process input
		return txrService.txr(Double.parseDouble(amount), fromAccNum, toAccNum);
	}
	
	@GetMapping(produces = "application/json")
	protected List<Account> getAccounts() {
		return accountRepository.findAll();
	}
	
	@GetMapping(value="/txns",produces = "application/json")
	protected List<Txn> getTxns() {
		return txnRepository.findAll();
	}
}
