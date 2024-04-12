package com.artstore.CustomerServiceModelDTO;

import com.artstore.CustomerServiceModel.Customer;
import com.artstore.CustomerServiceModel.Wishlist;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter // Automatically generates getters for all fields
public class WishlistDTO {

	private Long id;

	private Customer customer; // Assuming you need the customer ID in the DTO

	private Long productId;

	public WishlistDTO(Long id, Customer customer, Long productId) {
		this.id = id;
		this.customer = customer;
		this.productId = productId;
	}
	
	public WishlistDTO(Wishlist wishlist) {
		this.id = wishlist.getId();
		this.customer = wishlist.getCustomer();
		this.productId = wishlist.getProductId();
	
	}


	public WishlistDTO() {
		// Default constructor
	}
}