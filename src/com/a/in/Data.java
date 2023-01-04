package com.a.in;

import java.util.Scanner;

public class Data {

	/*
	 * This is an constructor called from main function
	 */
	public Data(String in[], int n) {
		System.out.println();
		System.out.println("String after Reverse: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(in[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number of words your String have....");
		int n = scan.nextInt();
		String in[] = new String[n];
		System.out.println("Enter the string: ");
		for (int i = 0; i <= n - 1; i++) {
			in[i] = scan.next();
		}
		Data r1 = new Data(in, n);
	}
}
