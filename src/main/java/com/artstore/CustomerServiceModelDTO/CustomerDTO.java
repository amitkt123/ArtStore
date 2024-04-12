package com.artstore.CustomerServiceModelDTO;

import com.artstore.CustomerServiceModel.Customer;
import java.util.*;

import com.artstore.CustomerServiceModel.Wishlist;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CustomerDTO 
{

    private Long id;

    private String name;

    private String email;

    private String address;

	private List<WishlistDTO> wishList;


	public CustomerDTO(Customer customer) {
		this.id = customer.getId();
		this.name = customer.getName();
		this.email = customer.getEmail();
		this.address = customer.getAddress();

		// Convert List<Wishlist> to List<WishlistDTO>
		List<Wishlist> wishlistItems = customer.getWishlistItems();
		List<WishlistDTO> wishlistDTOs = new ArrayList<>();
		for (Wishlist wishlist : wishlistItems) {
			WishlistDTO wishlistDTO = new WishlistDTO(wishlist);
			wishlistDTOs.add(wishlistDTO);
		}
		this.wishList = wishlistDTOs;
	}

	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}