package com.gamaset.digitalbank.repository;

import org.springframework.data.repository.CrudRepository;

import com.gamaset.digitalbank.repository.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
