package com.tns.ifet.day2;

public class NestedForLoopExample {

	public static void main(String[] args) {
		int a,b=10;
		for (a = 1; a <=10; a++) {
			for ( b = 1; b <=10; b++) {
				System.out.println(a+"x"+b+"="+a*b);
			}
		}

	}

}
