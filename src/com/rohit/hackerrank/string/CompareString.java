package com.rohit.hackerrank.string;

public class CompareString {

	public static void main(String[] args) {

		String A = "Banana";
		String B = "Gas";

		int i = A.compareTo(B);

		if (i >= 0) {
			System.out.println("The String " + A + " is bigger");
		} else {
			System.out.println("The string " + A + " is small");

		}
	}
}
