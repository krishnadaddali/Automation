package com.wfo.card.test;

import com.wfo.card.dao.Derived;
import com.wfo.card.helpermethods.Base;

public class BaseDerivedTest {

	public static void main(String args[]) {
		Base obj1 = new Derived();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		obj1.display();

		Derived.display();

		Base.display();

		obj1.go();
		obj1.walk();

		// Here overriding works and Derive's print() is called
		obj1.print();

		Derived obj2 = new Derived();

		obj2.run();

	}

}
