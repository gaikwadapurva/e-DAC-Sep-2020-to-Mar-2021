/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */
public class ArrayReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in)) {
			int t = in.nextInt();
			while (t -- > 0) {
				int n = in.nextInt();
				int a[] = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = in.nextInt();
				}
				for (int i = 0, j = n-1; i < n/2 && j >= n/2; i++, j--) {
					a[i] = a[i] * a[j];
					a[j] = a[i]/a[j];
					a[i] = a[i]/a[j];
				}
				System.out.print("Array Reverse - ");
				// System.out.println(a);
				for (int i = 0; i < n; i++) {
					System.out.print(a[i] + " ");
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
