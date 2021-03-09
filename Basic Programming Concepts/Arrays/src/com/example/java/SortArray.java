/**
 * 
 */
package com.example.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */
public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in)) {
			int t = scanner.nextInt();
			while (t -- > 0) {
				int n = scanner.nextInt();
				int a[] = new int[n];
				for (int i = 0; i < n; i++) {
					a[i] = scanner.nextInt();
				}
				Arrays.sort(a);
				System.out.print("Array after sorting - ");
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
