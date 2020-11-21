package com.kalp.kalpmvp.customer.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalp.kalpmvp.customer.model.Customer;
import com.kalp.kalpmvp.customer.service.CustomerService;
import com.kalp.kalpmvp.model.LogLevel;
import com.kalp.kalpmvp.utils.ErrorMessages;
import com.kalp.kalpmvp.utils.LogData;;

@RestController
@RequestMapping("/api/v1/customer/")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	@LogData(logLevel = LogLevel.INFO)
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
		Customer addedCustomer = customerService.addCustomer(customer);
		if(Objects.nonNull(addedCustomer)) {
			return new ResponseEntity<Customer>(addedCustomer, HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(ErrorMessages.AddExceptionMessage, HttpStatus.FORBIDDEN);
		}
	}
	
	@LogData(logLevel = LogLevel.DEBUG)
	@GetMapping("{id}")
	public ResponseEntity<?> getCustomer(@PathVariable("id") Long id) {
		Customer customer = customerService.getCustomerById(id);
		if(Objects.nonNull(customer)) {
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>(ErrorMessages.GetExceptionMessage, HttpStatus.FORBIDDEN);
		}
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> updateCustomer(@RequestBody Customer customer, @PathVariable("id")Long id) {
		Customer updatedCustomer = customerService.updateCustomer(id, customer);
		if(Objects.nonNull(updatedCustomer)) {
			return new ResponseEntity<Customer>(updatedCustomer, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>(ErrorMessages.UpdateExceptionMessage, HttpStatus.FORBIDDEN);
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id) {
		Boolean isDeleted = customerService.deleteCustomerById(id);
		return null;
	}
	
	/*
	 * @PatchMapping public ResponseEntity<?> updateCustomerField(@RequestBody
	 * Map<String, Object> data, @PathVariable("id")Long id) { Customer customer =
	 * customerService.updateCustomerFields(data, id); return ; }
	 */
	
}
