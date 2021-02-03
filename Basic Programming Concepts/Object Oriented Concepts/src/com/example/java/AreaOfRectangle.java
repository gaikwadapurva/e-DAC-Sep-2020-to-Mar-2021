/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to calculate area of a rectangle

public class AreaOfRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter length of rectangle: ");
		double l = in.nextDouble();
		System.out.print("Enter breadth of rectangle: ");
		double b = in.nextDouble();
		System.out.println("Area of given rectangle: " + (l*b));
	}

}
