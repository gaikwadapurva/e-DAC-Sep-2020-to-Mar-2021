/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java Program to add 2 numbers/binary numbers/characters

public class Add2Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Adding 2 numbers:");
		System.out.print("Enter 2 numbers to add - ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.println("Summation = " + (n1 + n2));
		System.out.println("Adding 2 binary numbers:");
		System.out.print("Enter 2 binary strings to add - ");
		int b1 = Integer.parseInt(in.next(), 2);
		int b2 = Integer.parseInt(in.next(), 2);
		System.out.println("Summation = " + (b1 + b2));
		System.out.println("Adding 2 characters:");
		System.out.print("Enter 2 characters to add - ");
		char c1 = in.next().charAt(0);
		char c2 = in.next().charAt(0);
		System.out.println("Summation = " + (char)(c1 + c2) + " or " + (c1 + c2));
	}

}
