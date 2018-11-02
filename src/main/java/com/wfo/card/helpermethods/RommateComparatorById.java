package com.wfo.card.helpermethods;

import java.util.Comparator;

import com.wfo.card.pojo.Roommate;

public class RommateComparatorById implements Comparator<Roommate> {

	public int compare(Roommate r1, Roommate r2) {
		if (r1.getId() == r2.getId())
			return 0;
		else if (r1.getId() > r2.getId())
			return 1;
		else
			return -1;
	}

}
