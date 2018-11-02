package com.wfo.card.test;

import java.util.ArrayList;
import java.util.Collections;

import com.wfo.card.helpermethods.RoommateComparatorByName;
import com.wfo.card.pojo.Roommate;

public class RoommateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create 6 persons objects
		Roommate gopi = new Roommate("Gopi", 101);
		Roommate sreeni = new Roommate("Sreeni", 111);
		Roommate sriram = new Roommate("Sriram", 121);
		Roommate sathya = new Roommate("Sathya", 131);
		Roommate balu = new Roommate("Balu", 141);
		Roommate krishna = new Roommate("Krishna", 151);

		// 6 rommats Added to the list

		ArrayList<Roommate> al = new ArrayList<Roommate>();

		al.add(gopi);
		al.add(sreeni);
		al.add(sriram);
		al.add(sathya);
		al.add(balu);
		al.add(krishna);

		System.out.println("Before sorting names: " + al);

		System.out.println("Before after sorting the names :");

		Collections.sort(al, new RoommateComparatorByName());

		for (Roommate rommate : al) {
			System.out.println(rommate);

		}
		/*
		 * CompareRoommateNames comparenames = new CompareRoommateNames();
		 * 
		 * System.out.println(comparenames.printRummetInfo());
		 */

		printRummetInfo();

	}

	public static void printRummetInfo() {

		ArrayList<Roommate> al = new ArrayList<Roommate>();

		for (Roommate rommate : al) {

			if (rommate.getName() == "Gopi") {
				System.out.println(rommate);
			}

		}
	}
}
