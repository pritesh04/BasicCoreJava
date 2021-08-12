package com.bridgelab.Junit;

import java.util.Scanner;

public class TemperatureConversion {
	static void temperaturConversion(int tempInFarenhite)
	{
		float Farenhite;
		float Celcius;
		Celcius = (float) ((tempInFarenhite - 32.0) * 5.0/9.0) ;
		Farenhite= (Celcius * 9/5) + 32;
		
		System.out.println("Tempreature in celcius is " + Celcius);
		System.out.println("Tempreature in Farenhite is "+ Farenhite);
		
		
		
	}
	public static void main(String[] args) {
		int tempInFarenhite;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		tempInFarenhite= sc.nextInt();
		temperaturConversion(tempInFarenhite);
	}
	

}
