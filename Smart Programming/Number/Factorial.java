//WAP to print factorial of a given number

// Factorial => the product of all integers smaller than or equal to n
// ex., 5 => 5*4*3*2*1 => 120

package com.practice.java;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int num = s1.nextInt();
		
		int factorial = 1;
		for(int i=1; i<=num; i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorial is : "+ factorial);
	}

}
