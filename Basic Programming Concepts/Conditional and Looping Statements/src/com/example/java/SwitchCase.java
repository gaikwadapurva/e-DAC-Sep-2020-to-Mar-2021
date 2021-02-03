/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program for switch case

public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter day number: ");
		switch (in.nextInt()) {
			case 1: {
				System.out.println("Sunday");
				break;
			}
			case 2: {
				System.out.println("Monday");
				break;
			}
			case 3: {
				System.out.println("Tuesday");
				break;
			}
			case 4: {
				System.out.println("Wednesday");
				break;
			}
			case 5: {
				System.out.println("Thursday");
				break;
			}
			case 6: {
				System.out.println("Friday");
				break;
			}
			case 7: {
				System.out.println("Saturday");
				break;
			}
			default: {
				System.out.println("Invalid day number");
				break;
			}
		}
	}

}
