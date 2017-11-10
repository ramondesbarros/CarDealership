package br.com.cardealership.service;

import java.util.List;

import br.com.cardealership.system.domain.Customer;

public interface CustomerService {

    List<Customer> listAllCustomer();

    Customer getCustomerById(Long id);

    String saveCustomer(Customer customer);

    void deleteCustomer(Long id);

}
