package com.tns.ifet.day1;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		byte bmax=127;
		byte bmin=-128;
        System.out.println("Max Range Of Byte:"+bmax+"\nMin Range Of Byte:"+bmin);
        
        short shortMax = 32767; 
        short shortMin = -32768; 
        System.out.println("Minshort range of byte is" + shortMin+"\nMaxshort range of byte is "+shortMax); 
      
        int maxInt = 2147483647; 
        int minInt = -2147483648; 
        System.out.println("Minint range of byte is" + minInt+"\nMaxint range of byte is "+maxInt); 
       
        long maxLong = 9223372036854775807L; 
        long minLong = -9223372036854775808L; 
        System.out.println("Minlong range of byte is" +minLong+"\nMaxlong range of byte is "+maxLong); 
        float f=3234.141243278345f; 
        double d=3456.14124512345678902345678914f; 
        System.out.println("Float value is "+f+"\nDouble value is "+d); 
        boolean stick=true;
        System.out.println("Boolen:"+stick);

	}

}
