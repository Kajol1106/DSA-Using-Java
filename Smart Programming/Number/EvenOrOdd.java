package com.practice.java;
import java.util.Scanner;

// WAP to find number is odd or even

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = s1.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("Entered number is odd");
		}
		else {
			System.out.println("Entered number is even");
		}
	}

}
