package com.artstore.Utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.artstore.CustomerServiceModel.Wishlist;
import com.artstore.CustomerServiceModelDTO.WishlistDTO;

public class UtilityMethods {
	public static Wishlist  WishListDTOToWishList(WishlistDTO wishlistDto) {
		Wishlist wishlist = new Wishlist();
		wishlist.setId(wishlistDto.getId());
		wishlist.setProductId(wishlistDto.getProductId());
		wishlist.setCustomer(wishlistDto.getCustomer());
		return wishlist;
		
	}
	  public static String hashPassword(String password) {
	        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	        return passwordEncoder.encode(password);
	    }
}
