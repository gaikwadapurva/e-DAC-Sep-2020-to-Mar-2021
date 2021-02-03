/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to find the factorial of a number

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a number between 1 and 15: ");
		long n = in.nextInt();
		long res = 1;
		for (long i = 2; i <= n; i++) {
			res *= i;
		}
		System.out.println("Factorial of " + n + " is: " + res);
	}
}
