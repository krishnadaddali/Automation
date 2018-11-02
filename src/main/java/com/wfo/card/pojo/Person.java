package com.wfo.card.pojo;

public class Person {

	private String name;
	private int id;
	private int age;
	private String graduation;

	public Person(String name, int id, int age, String graduation) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.graduation = graduation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age
				+ ", graduation=" + graduation + "]";
	}

}
