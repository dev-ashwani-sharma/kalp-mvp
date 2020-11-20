package com.kalp.kalpmvp.customer.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalp.kalpmvp.customer.model.Customer;
import com.kalp.kalpmvp.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	 
	public Customer addCustomer(Customer customer) {
		if(Objects.nonNull(customer)) {
			return customerRepository.save(customer);
		}
		else {
			return null;
		}
	}
	
	public Customer getCustomerById(Long id) {
		if(Objects.nonNull(id)) {
			return customerRepository.getCustomerById(id);
		}
		else {
			return null;
		}
	}

	public Customer updateCustomer(Long id, Customer customer) {
		if(Objects.nonNull(customer)) {
			customer.setId(id);
			return customerRepository.save(customer);
		}
		else {
			return null;
		}
	}

	public Boolean deleteCustomerById(Long id) {
		if(Objects.nonNull(id)) {
			customerRepository.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}

	/*
	 * public Customer updateCustomerFields(Map<String, Object> data, Long id) {
	 * 
	 * return null; }
	 */
	
	
}
