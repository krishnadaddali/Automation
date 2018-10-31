package com.wfo.card.test;

import java.util.List;

import com.wfo.card.dao.CustomerInfo;
import com.wfo.card.pojo.Customer;

public class CustomerInfoTest {

	public static void main(String[] args) {
		// printRamInfo();
		printCustomersInfo();

	}

	public static void printRamInfo() {

		CustomerInfo customerInfo = new CustomerInfo();

		Customer ram = customerInfo.getRamInfo();

		System.out.println("Ram information: " + ram.toString());

	}

	// method to print customer info ....get customers info from CustomerInfo
	// object.

	public static void printCustomersInfo() {

		CustomerInfo customersInfo = new CustomerInfo();

		List<Customer> customers = customersInfo.getCustomersInfo();

		for (Customer customer : customers) {

			if (customer.getName() == "Tam") {
				System.out.println(customer);
			}

		}

	}

}