package com.wfo.card.test;

import java.util.ArrayList;
import java.util.List;

public class FunctionsTest {

	public static void main(String args[]) {

		FunctionsTest obj = new FunctionsTest();
		obj.test();

		int add = obj.sum();
		System.out.println(add);

		String name = obj.getName();
		System.out.println("Hello " + name);

		int division = obj.division(30, 10);
		System.out.println(division);

		String concact = obj.concactString("Hello", "Word", 100, 200);
		System.out.println(concact);

		int array[] = obj.getNumbers(100, 200, 300);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		List<String> studentList = obj.getStudentsList("Siva", "Rama",
				"krishna");
		System.out.println(studentList);

	}

	// Two types of functions

	// 1. System defined:
	// Java has a library of (pre-defined) classes and
	// methods, organized in packages (e.g. java.util.Scanner).
	// In order to use them, we "import" the packages (or classes individually).
	// By default, the java.lang package is automatically imported, in any Java
	// programs.

	// 2. User defined:
	// 2a. No i/p and no o/p.
	// 2b. No i/p and some o/p.
	// 2c. some i/p and some o/p

	// 2a. No i/p and no o/p.
	// Void - Cannot return anything
	// Method overloading: with in the class, num of functions are they having
	// same method name and diff parameter list

	public void test() { // 0 param
		System.out.println("Test Method");
	}

	public void test(int i) { // 1 param
		System.out.println("Test Method");
	}

	public void test(String i) { // 1 param
		System.out.println("Test Method");
	}

	public void test(int i, int j) { // 2 param
		System.out.println("Test Method");
	}

	public void test(String i, String j) { // 2 param
		System.out.println("Test Method");
	}

	// 2b. No i/p and some o/p.
	// return type: int
	public int sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Add two number " + c);
		return c;
	}

	public String getName() {
		String name = "Tom";
		System.out.println("getName Method  ");
		return name;
	}

	// 2c. some i/p and some o/p
	public int division(int x, int y) {
		int z = x / y;
		System.out.println("Division Method:");
		return z;
	}

	public String concactString(String x, String y, int a, int b) {
		String con = x + y + a + b;
		System.out.println("Concat String Method");
		return con;
	}

	public int[] getNumbers(int a, int b, int c) {
		int arr[] = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		System.out.println("getNumbers Method");
		return arr;
	}

	public List<String> getStudentsList(String s1, String s2, String s3) {
		List<String> students = new ArrayList<String>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println("getStudentList");
		return students;
	}

}