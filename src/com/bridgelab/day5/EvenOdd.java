package com.bridgelab.day5;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	
	int Number;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	Number= sc.nextInt();
	if(Number%2==0)
			System.out.println(Number+ " is Even Number");
	else
		System.out.println(Number+ " is Odd Number");
}
}
