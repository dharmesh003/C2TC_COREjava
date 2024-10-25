package com.tns.ifet.day2;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a=100,b=20,c=500;
		if(a>b) {
			if(a>c) 
				System.out.println("A is larger:"+a);
			else
				System.out.println("C is larger:"+c);		
		}
		else {
			if (c>b) 
				System.out.println("C is larger:"+c);
			else
				System.out.println("B is larger:"+b);
			
		}

	}

}
