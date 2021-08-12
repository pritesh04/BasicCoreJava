package com.bridgelab.logical;

import java.util.Scanner;

public class perfectNo {
public static void main(String[] args) {
	int Number;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	Number= sc.nextInt();
	int Temp=0;
	//Temp= Number;
	for(int i=1;i<Number;i++)
	{
		if((Number%i)==0)
		{
			Temp=Temp+i;
			System.out.print(i + " ");
		}
	}
	System.out.println(Temp);
	
	  if(Number == Temp) { System.out.println("A perfect no"); } else
	  {System.out.println("Not a perfect no");}
	 
}
}
