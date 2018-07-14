package com.bank.mts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.AccountRepositoryImpl;
import com.bank.mts.repository.TxnRepopository;
import com.bank.mts.repository.TxnRepositoryImpl;
import com.bank.mts.service.TxrService;
import com.bank.mts.service.TxrServiceImpl;

@Configuration
@Import(value = { Bank_infra.class })
@ComponentScan(basePackages = { "com.bank.mts" })
public class Bank_mts {

	@Bean
	public AccountRepository accountRepositoery() {
		AccountRepository accountRepository = new AccountRepositoryImpl();
		return accountRepository;
	}

	@Bean
	public TxnRepopository txnRepository() {
		TxnRepopository txnRepopository = new TxnRepositoryImpl();
		return txnRepopository;
	}

	@Bean
	public TxrService txrService() {
		TxrService txrService = new TxrServiceImpl();
		txrService.setAccountRepository(accountRepositoery());
		txrService.setTxnRepopository(txnRepository());
		return txrService;
	}

}
