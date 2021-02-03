/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */
public class CircleComputations {

	/**
	 * @param args
	 */
	
	double area (double radius) {
		return (Math.PI * radius * radius);
	}
	
	double circumference (double radius) {
		return (2 * Math.PI * radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter radius of circle: ");
		double radius = in.nextDouble();
		System.out.println("Area of the given circle: " + (new CircleComputations().area(radius)));
		System.out.println("Circumference of the given circle: " + (new CircleComputations().circumference(radius)));
	}

}
