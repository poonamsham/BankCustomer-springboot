package com.bank.app.bankCustomerApp.service;

import com.bank.app.bankCustomerApp.model.Customer;
import com.bank.app.bankCustomerApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public String addCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Customer added successfully";
    }


    @Override
    public String updateCustomer(Customer customer,Long id) {
        Customer c = customerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found")
                );
        customer.setId(id);
        customerRepository.save(customer);
        return "Customer updated successfully";
    }

    @Override
    public String deleteCustomer(Long id) {
        Customer c = customerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found")
                );
        customerRepository.delete(c);
        return "Customer deleted successfully";
    }
}
