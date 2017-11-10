package br.com.cardealership.web;

import static br.com.cardealership.constants.CarDealershipConstants.CUSTOMER_ENDPOINT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardealership.service.CustomerService;
import br.com.cardealership.system.domain.Customer;

@RestController
@RequestMapping(CUSTOMER_ENDPOINT)
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(consumes = "application/json")
    public String saveCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomerById(Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Customer> getAllCustomer() {
        return customerService.listAllCustomer();
    }

    @PutMapping(consumes = "application/json")
    public void updateCustomer(Customer customer) {
        customerService.saveCustomer(customer);
    }

    @DeleteMapping(consumes = "application/json")
    public void deleteCustomer(Long id) {
        customerService.deleteCustomer(id);
    }

}
