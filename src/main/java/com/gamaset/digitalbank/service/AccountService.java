package com.gamaset.digitalbank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamaset.digitalbank.infra.exception.NotFoundException;
import com.gamaset.digitalbank.repository.AccountRepository;
import com.gamaset.digitalbank.repository.entity.Account;

@Service
public class AccountService {

	private AccountRepository accountRepository;

	@Autowired
	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public Account getAccount(Long accountId) {
		Account response = null;
		
		Optional<Account> accountOpt = accountRepository.findById(accountId);
		if(accountOpt.isPresent()) {
			response = accountOpt.get();
		}else {
			throw new NotFoundException("Conta nao encontrada");
		}
		
		return response;
	}

}
