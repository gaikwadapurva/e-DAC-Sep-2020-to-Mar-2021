/**
 * 
 */
package com.example.java;

import java.util.Scanner;

/**
 * @author apurva.gai
 *
 */

// Java program to print Fibonacci series upto N

public class FibonacciSeries {
	
	void fibonacci (int N) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < N && num1 <= N) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        } 
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a positive integer: ");
		int n = in.nextInt();
		System.out.println("Fibonacci series upto " + n + " is as given below:");
		new FibonacciSeries().fibonacci(n);
	}

}
