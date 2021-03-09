/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

public class AvgOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in)) {
			int t = in.nextInt();
			while (t -- > 0) {
				int n = in.nextInt();
				int sum = 0;
				for (int i = 1; i <= n; i++) {
					sum += in.nextInt();
				}
				System.out.println(sum/n);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
