package com.tns.ifet.day8.Interfaces.nestedinterfaces;

public interface MyInterface {
	void calculateArea();
    interface MyInnerInterface {
       int  id = 20;
       void print();     
    }
}
