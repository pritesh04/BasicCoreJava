package com.bridgelab.day5;

import java.util.Scanner;

public class HarmonicNumber {
public static void main(String[] args) {
	int Number;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	Number= sc.nextInt();
	float HarmonicNumber=1;
	for (int i=2 ; i<=Number ; i++)
	{
		HarmonicNumber= HarmonicNumber + (float)1/i;
	}
	System.out.println(HarmonicNumber);
	
}
}
