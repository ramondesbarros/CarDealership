package br.com.cardealership.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cardealership.integration.CustomerRepository;
import br.com.cardealership.service.CustomerService;
import br.com.cardealership.system.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> listAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public String saveCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Saved!";
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.delete(id);
    }

}
