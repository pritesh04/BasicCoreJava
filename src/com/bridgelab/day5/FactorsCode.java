package com.bridgelab.day5;

import java.util.Scanner;

public class FactorsCode {
public static void main(String[] args) {
	int Number;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	Number= sc.nextInt();
	System.out.println("Factors of " + Number );
	for(int i =1;i<=Number;i++)
	{
		if((Number%i)==0)
		{
			System.out.print(i + " ");
		}
	}
}
}
