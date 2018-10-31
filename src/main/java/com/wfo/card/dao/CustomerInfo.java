package com.wfo.card.dao;

import java.util.ArrayList;
import java.util.List;

import com.wfo.card.pojo.Customer;

public class CustomerInfo {

	// To display the ramInfo

	public Customer getRamInfo() {

		Customer ram = new Customer(111, 11223344, 999, "Plano, TX", "Ram");

		System.out.print(ram);

		return ram;

	}

	// TO display the customers information

	public List<Customer> getCustomersInfo() {

		Customer tam = new Customer(3, 122453, 1050, "Irving, TX", "Tam");
		Customer nam = new Customer(4, 124459, 1111, "San Antonio, TX", "Nam");
		Customer kim = new Customer(5, 133455, 1055, "Houston, TX", "Kim");

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(tam);
		customers.add(nam);
		customers.add(kim);

		return customers;
	}
}
