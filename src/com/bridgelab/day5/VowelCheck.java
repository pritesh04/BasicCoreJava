package com.bridgelab.day5;

import java.util.Scanner;

public class VowelCheck {
	public static void main(String[] args) {
		char s = 'a';

		System.out.println(s);
		if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
			System.out.println(s + " is a vowel");
		} else {
			System.out.println("Not a vowel and is consonant");
		}

	}
}
