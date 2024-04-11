package com.artstore.CustomerServiceModelDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter // Automatically generates getters for all fields
public class WishlistDTO {

    private Long id;

    private Long productId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public WishlistDTO(Long id, Long productId) {
		super();
		this.id = id;
		this.productId = productId;
	}

	public WishlistDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}