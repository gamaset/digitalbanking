package com.gamaset.digitalbank.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gamaset.digitalbank.infra.exception.AccountInvalidStatusException;
import com.gamaset.digitalbank.infra.exception.BusinessException;
import com.gamaset.digitalbank.repository.entity.Account;
import com.gamaset.digitalbank.repository.entity.AccountStatus;
import com.gamaset.digitalbank.schema.AccountSchema;
import com.gamaset.digitalbank.service.AccountService;

@Component
public class AccountBusiness {

	private AccountService accountService;

	@Autowired
	public AccountBusiness(AccountService accountService) {
		this.accountService = accountService;
	}

	public AccountSchema getAccountActive(Long accountId) {
		AccountSchema response = null;
		try {

			Account account = accountService.getAccount(accountId);

			if (account.getStatus().equals(AccountStatus.ACTIVE)) {
				response = new AccountSchema(account);
			} else {
				throw new AccountInvalidStatusException(String.format("Conta %S", account.getStatus()));
			}

		} catch (BusinessException e) {
			throw e;
		}
		
		return response;

	}

}
