//WAP to print multiplication table of a given number

package com.practice.java;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = s1.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + i*n);
		}
	}

}
