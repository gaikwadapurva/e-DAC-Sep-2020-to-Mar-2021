/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */
public class AddTwo2DArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in)) {
			int t = in.nextInt(); // Number of test cases
			while (t -- > 0) {
				int n = in.nextInt(); //Order of matrix
				int a[][] = new int[n][n];
				int b[][] = new int[n][n];
				System.out.println("Enter elements of array 1 - ");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						a[i][j] = in.nextInt();
					}
				}
				System.out.println("Enter elements of array 2 - ");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						b[i][j] = in.nextInt();
					}
				}
				System.out.println("Resultant array - ");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print((a[i][j] + b[i][j]) + " ");
					}
					System.out.println();
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
