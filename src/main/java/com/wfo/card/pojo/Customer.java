package com.wfo.card.pojo;

public class Customer {

	private int id;
	private int accNum;
	private int balance;
	private String address;
	private String name;

	public Customer(int id, int accNum, int balance, String address, String name) {
		super();
		this.id = id;
		this.accNum = accNum;
		this.balance = balance;
		this.address = address;
		this.name = name;
	}

	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", accNum=" + accNum + ", balance="
				+ balance + ", address=" + address + ", name=" + name + "]";
	}

}