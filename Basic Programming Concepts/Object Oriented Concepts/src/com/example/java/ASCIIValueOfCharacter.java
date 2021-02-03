/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to find ascii value of a character

public class ASCIIValueOfCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a character: ");
		char c = in.next().charAt(0);
		System.out.println("Ascii value of the character: " + (int)c);
	}

}
