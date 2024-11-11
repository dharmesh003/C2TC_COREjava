package com.tns.ifet.day7.overriding;

public class OverridingDemo {
	public static void main(String[] args) {
    RBI rbi=new RBI();
    rbi=new SBI();
    System.out.println(rbi.getRateOfInterest());
    rbi=new ICIC();
    System.out.println(rbi.getRateOfInterest());
    rbi=new HDFC();
    System.out.println(rbi.getRateOfInterest());
	}

}
