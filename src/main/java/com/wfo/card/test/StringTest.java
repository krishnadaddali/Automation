package com.wfo.card.test;

public class StringTest {

	public static void main(String a[]) {

		// printLegnth("krishna");

		// printCharacter("krishna");

		// characterCountInString("Ramakrishna", 'k');

		// compareTwoStrings("Ravi", "Saswith");

		// getCharIndex("Java Exercises!");

		// concatTwoStrings("PHP Exercises and", " Python Exercises");

		// containsMethod("PHP Exercises and Python Exercises", "and");

		// StringCompare("example.com", "example.com", "Example.com");

		printName("krishna", "Daddali", 10);
	}

	// write a method that gets string as input and prints the length of the
	// string

	public static void printLegnth(String name) {
		System.out.println(name.length());

	}

	// write a method that gets string as input and prints each character in the
	// string

	public static void printCharacter(String name) {

		int length = name.length();

		for (int i = 0; i < length; i++) {
			System.out.println(name.charAt(i));

		}

	}

	// write a method that gets string and character as inputs, and prints the
	// how many times input character is repeated

	public static void characterCountInString(String name, char inputChar) {

		int length = name.length();
		int count = 0;
		for (int i = 0; i < length; i++) {

			if (inputChar == name.charAt(i)) {
				count = count + 1;
			}

		}

		System.out.println("character count =" + count);

	}

	// write a method that gets two strings as inputs, compare two names equal
	// or not

	public static void compareTwoStrings(String s1, String s2) {

		System.out.println(s1.equals(s2));

	}

	// Write a Java program to get the character at the given index within the
	// String.

	public static void getCharIndex(String name, int index) {

		System.out.println(name.charAt(index));

	}

	// Write a Java program to take two strings as a input and concatenate a
	// given string to the end of another
	// string

	public static void concatTwoStrings(String s1, String s2) {

		System.out.println(s1.concat(s2));

	}

	// Test if a given string contains the specified sequence of char values

	public static void containsMethod(String s1, String s2) {

		System.out.println(s1.contains(s2));
	}

	// Write a Java program to compare a given string to the specified

	public static void StringCompare(String s1, String s2, String s3) {

		System.out.println(s1.contentEquals(s2));
		System.out.println(s2.equals(s3));

	}

	// Write a method that will take 2 inputs and multipication

	public static void Multipication(int a, int b) {

		System.out.println(a * b);
	}

	// write a logic how times print the name is given as a input
	public static void printName(String s1, String s2, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = count + 1;
			System.out.println(count + s1 + s2);
		}
	}
}