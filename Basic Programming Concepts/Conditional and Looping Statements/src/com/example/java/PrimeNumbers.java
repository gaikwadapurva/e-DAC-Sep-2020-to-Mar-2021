/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to display prime numbers between 1 and 100 or 1 and n

public class PrimeNumbers {
	
	void print_primes_till_N (int N) {
	    int flag;
	    System.out.println("Prime numbers between 1 and " + N + " are:");
	    for (int i = 1; i <= N; i++) {
	    	if (i == 1 || i == 0) continue;
	        flag = 1; 
	        for (int j = 2; j <= i / 2; ++j) {
	            if (i % j == 0) {
	                flag = 0; 
	                break; 
	            } 
	        }
	        if (flag == 1) {
	        	System.out.print(i + " ");
	        }
	    }
	    System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a number between 1 and 100: ");
		new PrimeNumbers().print_primes_till_N(in.nextInt());
	}

}
