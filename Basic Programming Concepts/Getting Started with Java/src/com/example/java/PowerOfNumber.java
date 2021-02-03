/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to calculate power of a number

public class PowerOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number - ");
		double num = in.nextDouble();
		System.out.print("Enter a radix - ");
		double radix = in.nextDouble();
		double power = Math.pow(num, radix);
		System.out.println("Power = " + power);
	}

}
