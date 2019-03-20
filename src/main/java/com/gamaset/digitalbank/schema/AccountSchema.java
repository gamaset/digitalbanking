package com.gamaset.digitalbank.schema;

import java.math.BigDecimal;

import com.gamaset.digitalbank.repository.entity.Account;
import com.gamaset.digitalbank.repository.entity.AccountStatus;

public class AccountSchema {

	private Long id;
	private BigDecimal balance;
	private AccountStatus status;
	
	public AccountSchema() {
	}

	public AccountSchema(Account account) {
		setId(account.getId());
		setBalance(account.getBalance());
		setStatus(account.getStatus());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	
	

}
