/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */
public class CharArrayToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in)) {
			int t = in.nextInt();
			while (t -- > 0) {
				int n = in.nextInt();
				char c[] = new char[n];
				for (int i = 0; i < n; i++) {
					c[i] = in.next().charAt(0);
				}
				System.out.println("Converting the char array to string - " + String.valueOf(c));
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
