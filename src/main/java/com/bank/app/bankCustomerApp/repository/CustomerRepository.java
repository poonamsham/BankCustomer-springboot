package com.bank.app.bankCustomerApp.repository;

import com.bank.app.bankCustomerApp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
