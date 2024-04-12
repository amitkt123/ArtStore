package com.artstore.CustomerServiceModel;

 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Entity
@Setter
public class Wishlist 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;


	@Column(name = "product_id")
	private Long productId;

	public Wishlist(Long id, Customer customer, Long productId) {
		super();
		this.id = id;
		this.customer = customer;
		this.productId = productId;
	}

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
