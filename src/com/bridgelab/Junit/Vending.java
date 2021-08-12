package com.bridgelab.Junit;
import java.util.Scanner;

public class Vending {
	public static void main(String[] args) {
		int rs;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Rupees to remove ");
		rs= sc.nextInt();
		int one = 0, two = 0, five = 0, ten = 0, fifty = 0, hundred = 0, fiveHundred = 0, thousand = 0;

		while (rs>0) {
			
			if (rs >= 1000)
			{
				rs = rs - 1000;
				thousand++;
			}
			else if (rs >= 500)
			{
				rs = rs - 500;
				fiveHundred++;

			}
			else if (rs >= 100)
			{
				rs = rs - 100;
				hundred++;
			}
			else if (rs >= 50)
			{
				rs = rs - 50;
				fifty++;
			} 
			else if (rs >= 10)
			{
				rs = rs - 10;
				ten++;
			}
			else if (rs >= 5) 
			{
				rs = rs - 5;
				five++;
			}
			else if (rs >= 2) 
			{
				rs = rs - 2;
				two++;
			}
			else if (rs >= 1) 
			{
				rs = rs - 1;
				one++;
			}
			
		}
		
		System.out.println("1000 rs note" + thousand);
		System.out.println("500 rs note" + fiveHundred);
		System.out.println("100 rs note" + hundred);
		System.out.println("50 rs note" + fifty);
		System.out.println("10 rs note" + ten);
		System.out.println("5 rs note" + five);
		System.out.println("2 rs note" + two);
		System.out.println("1 rs note" + one);
	}
}
