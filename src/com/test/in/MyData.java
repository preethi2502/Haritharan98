package com.test.in;

public class MyData {
	public static void vote(int age) throws Throwable {
		if (age >= 18) {
			System.out.println("eligible");
		}

		else {
			throw new ArithmeticException("not eligible");

		}
		System.out.println("go to the next page....");

	}

	public static void main(String[] args) throws Throwable  {
		vote(8);
	}

}
