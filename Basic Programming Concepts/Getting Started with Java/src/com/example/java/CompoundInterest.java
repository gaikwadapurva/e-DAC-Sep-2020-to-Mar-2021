/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to calculate compound interest

public class CompoundInterest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter principal amount - ");
		double p = in.nextDouble();
		System.out.print("Enter rate of interest - ");
		double r = in.nextDouble();
		System.out.print("Enter time period - ");
		double t = in.nextDouble();
		double CI = p * (Math.pow((1 + r/100.0), t));
		System.out.println("Compound Interest = " + CI);
	}

}
