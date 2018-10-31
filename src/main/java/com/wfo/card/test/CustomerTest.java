package com.wfo.card.test;

import java.util.ArrayList;
import java.util.List;

import com.wfo.card.pojo.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// create 2 objects

		Customer ram = new Customer();
		ram.setId(1);
		ram.setAccNum(123456);
		ram.setName("Ram");
		ram.setAddress("Frisco, TX");
		ram.setBalance(500);

		Customer sam = new Customer(2, 123457, 1000, "Plano, TX", "Sam");

		// display 2 customers details

		System.out.println("id :" + ram.getId() + " AccountNumber :"
				+ ram.getAccNum() + " Name :" + ram.getName() + " Address :"
				+ ram.getAddress() + " Balance :" + ram.getBalance());

		System.out.println(sam);

		// Change the Ram balance
		ram.setBalance(1005);
		System.out.println(ram);

		// Create 3 more new customers and add to the list

		Customer tam = new Customer(3, 122453, 1050, "Irving, TX", "Tam");
		Customer nam = new Customer(4, 124459, 1111, "San Antonio, TX", "Nam");
		Customer kim = new Customer(5, 133455, 1055, "Houston, TX", "Kim");

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(sam);
		customers.add(ram);
		customers.add(tam);
		customers.add(nam);
		customers.add(kim);

		System.out.println("Second Customer: " + customers.get(2));

	}
}
