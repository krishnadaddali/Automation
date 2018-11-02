package com.wfo.card.helpermethods;

import java.util.Comparator;

import com.wfo.card.pojo.Roommate;

public class RoommateComparator implements Comparator<Roommate> {

	public int compare(Roommate r1, Roommate r2) {
		// TODO Auto-generated method stub
		return r1.getName().compareTo(r2.getName());
	}
}