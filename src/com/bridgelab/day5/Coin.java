package com.bridgelab.day5;

import java.util.Iterator;
import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Flips");
		int noOfFlips= sc.nextInt();
		int mx=0;
		int mn=1;
		int head=0;
		int tail=0;
		for(int i=0;i<noOfFlips;i++)
		{
			double  choice =  (Math.random()*(mx-mn+1)+mn);
			
			if(choice<0.5)
			{
				head++;
			}
			else
			{tail++;}
		}
		int HeadPercentage= (head/noOfFlips)*100;
		System.out.println(HeadPercentage);
		int TailPercentage= (tail/noOfFlips)*100;
		System.out.println(TailPercentage);
	}

}
