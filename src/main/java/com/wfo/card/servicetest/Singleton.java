package com.wfo.card.servicetest;

public class Singleton {

	// In OOPS, A singleton class is a class that can have only one
	// object(Instance of the class) at a time.
	// How to design a singleton class:
	// 1. Make a constructor as private
	// 2. Write a static method(getInstance) that has return type of object of
	// this singleton class(Lazy Initialization)

	// Diff b/w Normal class nad Singleton class
	// For normal class we use constructor whereas for singleton class we use
	// getInstance() method for instance

	private static Singleton singleton_instance = null;
	public String str;

	public Singleton() {
		str = "Hey I am using Singleton class pattern";
	}

	public static Singleton getInstance() {

		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}
}
