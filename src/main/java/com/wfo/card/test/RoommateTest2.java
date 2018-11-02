package com.wfo.card.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wfo.card.helpermethods.RommateComparatorById;
import com.wfo.card.helpermethods.RoommateComparatorByName;
import com.wfo.card.pojo.Roommate;

public class RoommateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Roommate> roomMatesList = createRoomMatesList();

		System.out.println("Before sorting names: " + roomMatesList);

		System.out.println("**********Sorting By Names ******* ");

		Collections.sort(roomMatesList, new RoommateComparatorByName());

		roomMatesList.size();
		roomMatesList.contains("krishna");

		for (Roommate rommate : roomMatesList) {

			System.out.println(rommate);

		}

		// System.out.println("Before after sorting the names :" +
		// roomMatesList);

		Collections.sort(roomMatesList, new RommateComparatorById());

		System.out.println("**********Sorting By Id ********");

		for (Roommate rommate : roomMatesList) {

			System.out.println(rommate);

		}

		// System.out.println("Before after sorting the Id's :" +
		// roomMatesList);

		printRummetInformation(roomMatesList);

	}

	public static List<Roommate> createRoomMatesList() {

		// Create 6 persons objects
		Roommate gopi = new Roommate("Gopi", 101);
		Roommate sreeni = new Roommate("Sreeni", 111);
		Roommate sriram = new Roommate("Sriram", 121);
		Roommate sathya = new Roommate("Sathya", 131);
		Roommate balu = new Roommate("Balu", 141);
		Roommate krishna = new Roommate("Krishna", 151);

		List<Roommate> roomMates = new ArrayList<Roommate>();

		roomMates.add(gopi);
		roomMates.add(sreeni);
		roomMates.add(sriram);
		roomMates.add(sathya);
		roomMates.add(balu);
		roomMates.add(krishna);

		return roomMates;
	}

	public static void printRummetInformation(List<Roommate> roomMatesList) {

		for (Roommate rommate : roomMatesList) {

			if (rommate.getName() == "Gopi") {
				System.out.println(rommate);
			}

		}
	}
}
