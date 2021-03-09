/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */
public class HighestAndSecondHighest {

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
				a[0] = in.nextInt();
				int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;
				for (int i = 1; i < n; i++) {
					a[i] = in.nextInt();
					if (a[i] > highest) {
						highest = a[i];
					}
					if (a[i] > secondHighest && a[i] < highest) {
						secondHighest = a[i];
					}
				}
				if (secondHighest == Integer.MIN_VALUE) {
					secondHighest = highest;
				}
				System.out.println("Highest = " + highest + ", Second highest = " + secondHighest);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
