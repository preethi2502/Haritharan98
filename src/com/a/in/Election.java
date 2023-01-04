package com.a.in;

public class Election {

	public static void vote(int age) throws Exception {
		if (age >= 18) {
			System.out.println("eligible");
		} else {
			throw new MyException("not eligible");
		}
		System.out.println("go to the next page...");

	}

	public static void senior(int age) throws Exception {
		if (age >= 50) {
			System.out.println("senior");
		} else {
			throw new MyException("not senior");
		}
		System.out.println("go to the next page...");

	}

	public static void main(String[] args) throws Exception {
		vote(15);
		senior(15);
	}

}
