package com.wfo.card.test;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basics basics = new Basics();

		basics.add();

		basics.sub(10, 20);

	}

	// helper methods

	public int add() {

		int i, j, a;

		i = 10;
		j = 20;

		a = i + j;

		System.out.println("Add two num:" + a);

		return a;
	}

	public int sub(int i, int j) {

		int a = j - i;

		System.out.println("Add two num:" + a);

		return a;

	}

}
