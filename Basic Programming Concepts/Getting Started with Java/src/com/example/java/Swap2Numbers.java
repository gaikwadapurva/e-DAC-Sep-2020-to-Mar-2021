/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to swap 2 numbers

public class Swap2Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter first number: ");
		int n1 = in.nextInt();
		System.out.print("Enter second number: ");
		int n2 = in.nextInt();
		System.out.println("Numbers before swapping: " + n1 + " and " + n2);
		n1 = n1 * n2;
		n2 = n1/n2;
		n1 = n1/n2;
		System.out.println("Numbers after swapping: " + n1 + " and " + n2);
	}

}
