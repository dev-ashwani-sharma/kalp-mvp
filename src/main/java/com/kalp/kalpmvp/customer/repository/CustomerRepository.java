package com.kalp.kalpmvp.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalp.kalpmvp.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	public Customer save(Customer customer);

	public Customer getCustomerById(Long id);

	public void deleteById(Long id);
	
}
