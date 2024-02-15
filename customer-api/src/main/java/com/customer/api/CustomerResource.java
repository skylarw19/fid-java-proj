package com.customer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {
	
	@GetMapping("/customer-message")
	public CustomerResponse getMessage() {
		return new CustomerResponse("Hello customer");
	}
}
