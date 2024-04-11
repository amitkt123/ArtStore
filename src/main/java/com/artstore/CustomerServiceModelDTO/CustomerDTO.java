package com.artstore.CustomerServiceModelDTO;

import com.artstore.CustomerServiceModel.Customer;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter // Automatically generates getters for all fields
public class CustomerDTO 
{

    private Long id;

    private String name;

    private String email;

    private String address;
    
  
    // Add other relevant customer details for DTO

    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public CustomerDTO(Customer customer) {
    	 
        this.id = customer.getId();
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.address = customer.getAddress();
        // Map other relevant customer details
    }


	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}