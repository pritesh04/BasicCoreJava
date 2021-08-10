package com.bridgelab.day5;

import java.util.Scanner;

public class ComputeQuotientRemainder {
public static void main(String[] args) {
	int Number;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	Number= sc.nextInt();
	
	double Quotient= Number/2;
	double Remainder= Number%2;
	System.out.println("Quotient is " + Quotient);
	System.out.println("Remainder is "+ Remainder);
}
}

