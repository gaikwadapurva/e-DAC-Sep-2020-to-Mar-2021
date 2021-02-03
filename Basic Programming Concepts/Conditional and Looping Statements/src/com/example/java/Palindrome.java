/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to check if a number is a palindrome or not

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a positive integer: ");
		int n = in.nextInt();
		int rev = 0;
		int temp = n;
		while (temp > 0) {
			rev = (rev * 10) + temp % 10;
			temp /= 10;
		}
		if (n == rev) {
			System.out.println("The entered number is a palindrome.");
		}
		else {
			System.out.println("The entered number is not a palindrome");
		}
	}

}
