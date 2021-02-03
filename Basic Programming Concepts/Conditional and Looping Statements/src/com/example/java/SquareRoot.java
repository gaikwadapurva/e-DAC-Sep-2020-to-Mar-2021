/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to find square root of a number without using sqrt method

public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		System.out.println("Square root of " + n + " is: " + Math.pow(2, 0.5 * (Math.log(n) / Math.log(2))));
	}

}
