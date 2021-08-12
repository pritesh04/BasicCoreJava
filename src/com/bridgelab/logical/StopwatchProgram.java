package com.bridgelab.logical;

import java.util.Scanner;

public class StopwatchProgram {
	public static void main(String[] args) {
		String s, s1;
		long start, stop;
		Scanner sc = new Scanner(System.in);

		System.out.println("tap to start the stopwatch");
		s = sc.next();
		start = System.currentTimeMillis();
		System.out.println("tap to stop the stopwatch");
		s1 = sc.next();
		stop = (System.currentTimeMillis() - start) / 1000;

		System.out.printf("Total time taken is " + stop + " seconds");
	}
}