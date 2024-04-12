package com.artstore.CustomerServiceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artstore.CustomerServiceModelDTO.CustomerDTO;
import com.artstore.CustomerServices.CustomerServiceService;

@RestController
@RequestMapping("/customers")
public class CustomerServiceController {

	@Autowired
	private CustomerServiceService customerService;

	@PostMapping
	public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
		CustomerDTO createdCustomerDTO = customerService.createCustomer(customerDTO);
		return ResponseEntity.ok(createdCustomerDTO);
	}

	// Implement other controller methods for customer related functionalities
}