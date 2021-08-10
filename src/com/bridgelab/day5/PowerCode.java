package com.bridgelab.day5;


import java.util.Scanner;

public class PowerCode {
public static void main(String[] args) {
	int Number;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	Number= sc.nextInt();
	
	int PowerOfNumber=1;
	for (int i=1;i<=Number;i++)
	{
		PowerOfNumber= 2*Number;
	}
	System.out.println(PowerOfNumber);
}
}
