package com.tns.ifet.day6.staticvariable;

public class Employee {
	private String name;
	private int id;
	
	
	static String companyName = "IFET";

		Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}

}
