package com.bank.mts.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.JdbcAccountRepository;
import com.bank.mts.service.TxrService;
import com.bank.mts.service.TxrServiceImpl;

@Configuration
@Import(value = { Bank_infra.class })
@ComponentScan(basePackages = { "com.bank.mts" })
public class Bank_mts {

	@Autowired
	private DataSource dataSource;

	@Bean
	public AccountRepository accountRepositoery() {
		AccountRepository accountRepository = new JdbcAccountRepository(dataSource);
		return accountRepository;
	}

	@Bean
	public TxrService txrService() {
		TxrService txrService = new TxrServiceImpl();
		txrService.setAccountRepository(accountRepositoery());
		return txrService;
	}

}
