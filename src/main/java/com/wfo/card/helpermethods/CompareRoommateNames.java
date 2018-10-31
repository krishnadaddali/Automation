package com.wfo.card.helpermethods;

import java.util.ArrayList;

import com.wfo.card.pojo.Roommate;

public class CompareRoommateNames {

	public static void printRummetInfo() {

		ArrayList<Roommate> al = new ArrayList<Roommate>();

		for (Roommate rommate : al) {

			if (rommate.getName() == "Gopi") {
				System.out.println(rommate);
			}

		}
	}

}