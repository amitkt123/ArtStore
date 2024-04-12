package com.artstore.CustomerServiceModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(unique = true)
	private String email;

	@JsonIgnoreProperties // Exclude password from JSON serialization for security
	private String password;

	private String address;

	 

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Wishlist> wishlistItems;



	public Customer(Long id, String name, String email, String password, String address, List<Wishlist> wishlistItems) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.wishlistItems = wishlistItems;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer save(Customer newCustomer) {
		// TODO Auto-generated method stub
		return null;
	}
    
    
    
    
    

}
