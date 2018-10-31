package com.wfo.card.test;

import java.util.ArrayList;
import java.util.List;

import com.wfo.card.pojo.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = createList();

		List<Person> duplicatePersons = duplicateList(persons);

		printList(null);

		printList(duplicatePersons);
	}

	// 1. Create a list and add to the 4 objects

	public static List<Person> createList() {

		Person ramesh = new Person("Ramesh", 101, 21, "Bachelors");
		Person suresh = new Person("Suresh", 131, 19, "Degree");
		Person mahesh = new Person("Mahesh", 121, 17, "Intermediate");
		Person kailesh = new Person("kailesh", 141, 15, "Tength class");

		List<Person> persons = new ArrayList<Person>();

		persons.add(ramesh);
		persons.add(suresh);
		persons.add(mahesh);
		persons.add(kailesh);

		System.out.println(persons);
		return persons;

	}

	public static List<Person> duplicateList(List<Person> persons) {

		List<Person> newPersons = new ArrayList<Person>();
		for (Person person : persons) {

			newPersons.add(person);

		}

		return newPersons;

	}

	public static void printList(List<Person> persons)
			throws NullPointerException {

		try {
			for (Person person : persons) {

				System.out.println(person);

			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
