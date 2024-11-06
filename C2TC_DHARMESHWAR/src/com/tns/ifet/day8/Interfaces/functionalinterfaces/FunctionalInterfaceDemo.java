package com.tns.ifet.day8.Interfaces.functionalinterfaces;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Night";
		};

		System.out.println(g1.greet());

	}
}
