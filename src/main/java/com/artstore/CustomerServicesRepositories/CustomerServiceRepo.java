package com.artstore.CustomerServicesRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artstore.CustomerServiceModel.Customer;

@Repository
public interface CustomerServiceRepo extends JpaRepository<Customer, Long> {
	
}