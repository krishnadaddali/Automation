package com.wfo.card.test;

public class LoopsExample {

	// Global Variable

	private static String[] names = { "Alpha", "Beta", "Gamma", "Delta",
			"Sigma" };

	// Main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNamesUsingForLoop();

		printNamesUsingForEachLoop();

		comapreNames();

	}

	// Using for loop

	public static void printNamesUsingForLoop() {

		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i]);

		}

	}

	// Using for each loop

	public static void printNamesUsingForEachLoop() {

		System.out.println("******************");

		for (String name : names) {

			if (name.equals("Alpha"))

				System.out.println(name + "\n");

		}

		System.out.println("************************");

	}

	// Compare two names

	public static void comapreNames() {

		System.out.println("Compare the name: ");

		for (String name : names) {

			if (name == "Alpha") {

				System.out.println("****" + name + "*****" + "\n");

			} else {

				System.out.println("Name is: " + name + "\n");

			}

		}

		System.out.println("Print the names except Alpha: ");

	}
}
