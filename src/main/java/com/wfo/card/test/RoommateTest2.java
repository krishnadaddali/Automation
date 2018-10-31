package com.wfo.card.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wfo.card.helpermethods.RoommateComparator;
import com.wfo.card.pojo.Roommate;

public class RoommateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Roommate> roomMatesList = createRoomMatesList();

		System.out.println("Before sorting names: " + roomMatesList);

		System.out.println("Before after sorting the names :");

		Collections.sort(roomMatesList, new RoommateComparator());

		printRummetInfo(roomMatesList);

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

	public static void printRummetInfo(List<Roommate> roomMatesList) {

		for (Roommate rommate : roomMatesList) {

			if (rommate.getName() == "Gopi") {
				System.out.println(rommate);
			}

		}
	}
}
