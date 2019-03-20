package com.gamaset.digitalbank.repository;

import org.springframework.data.repository.CrudRepository;

import com.gamaset.digitalbank.repository.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
