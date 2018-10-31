package com.wfo.card.servicetest;

public class ReplaceTheChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String myName = "domanokz"; String newName = myName.substring(0, 4) +
		 * 'x' + myName.substring(5); System.out.println(newName);
		 */

		String myName = "domanokz";
		char[] myNameChars = myName.toCharArray();
		myNameChars[4] = 'x';
		myName = String.valueOf(myNameChars);

		System.out.println(myNameChars);
	}

}
