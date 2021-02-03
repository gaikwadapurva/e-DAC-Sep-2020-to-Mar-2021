/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to check whether given number is Armstrong number or not

public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		int temp = n;
		int res = 0;
		while (temp > 0) {
			int mod = temp%10;
			res += Math.pow(mod, 3);
			temp /= 10;
		}
		if (n == res) {
			System.out.println("The entered number is an Armstrong number.");
		}
		else {
			System.out.println("The entered number is not an Armstrong number.");
		}
	}

}
