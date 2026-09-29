package com.bank.app.bankCustomerApp.service;

import com.bank.app.bankCustomerApp.model.Customer;
import com.bank.app.bankCustomerApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    List<Customer> findAllCustomers();

    String addCustomer(Customer  customer);

    String updateCustomer(Customer  customer,Long id);

    String deleteCustomer(Long id);
}
