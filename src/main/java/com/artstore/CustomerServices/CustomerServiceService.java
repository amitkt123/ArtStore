package com.artstore.CustomerServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artstore.CustomerServiceModel.Customer;
import com.artstore.CustomerServiceModel.Wishlist;
import com.artstore.CustomerServiceModelDTO.CustomerDTO;
import com.artstore.CustomerServiceModelDTO.WishlistDTO;
import com.artstore.CustomerServicesRepositories.CustomerServiceRepo;
import com.artstore.SecurePass.SecurePasswordGenerator;
import com.artstore.Utils.UtilityMethods;

@Service
public class CustomerServiceService {
	
	    private final CustomerServiceRepo customerRepository;
	    
	 
	    public  CustomerServiceService(CustomerServiceRepo customerRepository) {
	        this.customerRepository = customerRepository;
	    }
	    
	public CustomerDTO createCustomer(CustomerDTO customerDTO) {
	
		 long Id = customerDTO.getId();
		 String name = customerDTO.getName();
		 String email = customerDTO.getEmail();
		 String pass = SecurePasswordGenerator.generateSecurePassword();
		 String encodedPass = UtilityMethods.hashPassword(pass);
		 String address = customerDTO.getAddress();
		 List<WishlistDTO> list = customerDTO.getWishList();
		 List<Wishlist> wishList = new ArrayList<>();
		
		 for(WishlistDTO ele : list) 
		 {
			 Wishlist wishlist = UtilityMethods.WishListDTOToWishList(ele);
			 wishList.add(wishlist); 
		 }
		 
		 Customer newCustomer = new Customer(Id, name, email, encodedPass, address, wishList);
		 newCustomer = customerRepository.save(newCustomer);
		 return new CustomerDTO(newCustomer);
	}

}
