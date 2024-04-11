package com.artstore.CustomerServiceModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    private String name;

    @Column(unique = true)
    private String email;

    @JsonIgnoreProperties // Exclude password from JSON serialization for security
    private String password;

    private String address;

    // Add other relevant customer attributes like phone number etc.

    @OneToMany(mappedBy = "customer")
    private List<Wishlist> wishlistItems;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Wishlist> getWishlistItems() {
		return wishlistItems;
	}

	public void setWishlistItems(List<Wishlist> wishlistItems) {
		this.wishlistItems = wishlistItems;
	}

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
    
    
    
    
    

}
