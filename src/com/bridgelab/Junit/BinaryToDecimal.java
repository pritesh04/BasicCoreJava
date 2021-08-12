package com.bridgelab.Junit;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int Number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		Number = sc.nextInt();
		int binary[] = new int[40];
		int index = 0;
		for (int i = 0; i < 8; i++) {

			if (Number > 0) {
				binary[index++] = Number % 2;
				Number = Number / 2;
			} else {
				System.out.print(0);
			}

		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
		int temp;
		for (int i = 0; i < index; i++) {
			for (int j = index / 2; j < index; j++) {
				temp = binary[i];
				binary[i] = binary[j];
				binary[j] = temp;

			}

		}

		for (int i = 0; i < 8; i++) {
			System.out.print(binary[i]);
		}
		int n=0,decimal = 0;
		for (int i = 0; i < 8; i++) {
			  int temp1 = binary[i]%10;  
	          decimal += temp1*Math.pow(2, n);  
	          binary[i] = binary[i]/10;  
	          n++;  
			
		} 
		System.out.println();
		System.out.print(decimal);	

	}
}
