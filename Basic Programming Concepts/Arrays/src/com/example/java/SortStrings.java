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
public class SortStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in)) {
			int t = in.nextInt();
			while (t -- > 0) {
				int n = in.nextInt();
				String s[] = new String[n];
				for (int i = 0; i < n; i++) {
					s[i] = in.next();
				}
				Arrays.sort(s);
				System.out.print("Strings after sorting in alphabetical order - ");
				for (int i = 0; i < n; i++) {
					System.out.print(s[i] + " ");
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
