package com.bridgelab.logical;

public class ReverseNumber {
public static void main(String[] args) {
	int Number=1234;
	int ReverseNumber = 0;
	while(Number!=0)
	{
		int remainder=Number%10;
		ReverseNumber=ReverseNumber*10+remainder;
		Number= Number/10;
		
	}
	System.out.println(ReverseNumber);
}
}
