package com.bridgelab.day5;

public class SwappingNumber {
	public static void main(String[] args) {
		int a = 21;
		int b = 34;
		int c = 0;
		System.out.println("Before swapping" + a + "  " + b);
		c = a;
		a = b;
		b = c;
		c = a;

		System.out.println("After swapping" + a + "  " + b);
		
		System.out.println("Without using 3rd variable---------- ");
		System.out.println("Before swapping" + a + "  " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping" + a + "  " + b);
	}
}
