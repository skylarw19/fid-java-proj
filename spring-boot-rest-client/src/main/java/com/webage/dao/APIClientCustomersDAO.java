package com.webage.dao;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.webage.domain.Customer;

@Repository
public class APIClientCustomersDAO implements CustomersDAO {

	String customersAPIbase="http://localhost:8080/customers";
	
	@Override
	public Collection<Customer> getAllCustomers() {
		RestTemplate template=new RestTemplate();
		Customer[] customers=template.getForObject(customersAPIbase, Customer[].class);
		return Arrays.asList(customers);
	}

}
