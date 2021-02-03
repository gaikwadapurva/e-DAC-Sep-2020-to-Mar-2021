/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program for recursion

public class Recursion {
	
	int factorial (int N) {
		if (N == 2) {
			return 2;
		}
		return N * factorial(N-1);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a positive integer: ");
		System.out.println("Factorial of the given number is: " + (new Recursion().factorial(in.nextInt())));
	}

}
