package com.wfo.card.test;

public class CheckEvenOddNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputEvenOddNum(4);

		inputEvenOddNum(5);

		printEvenNum(100);

	}

	public static void inputEvenOddNum(int a) {

		if (a % 2 == 0) {

			System.out.println(a + " : is a even num ");
		} else
			System.out.println(a + " : is odd num: ");

	}

	public static void printEvenNum(int i) {

		for (i = 0; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " : is a even num ");
			}
		}

	}

	public static void printPrimaryNum(int i) {

		for (i = 0; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " : is a even num ");
			}

		}

	}
}