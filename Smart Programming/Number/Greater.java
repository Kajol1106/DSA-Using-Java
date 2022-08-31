package com.practice.java;

import java.util.Scanner;

//WAP to find greater number between three numbers

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int n1 = s1.nextInt();
		
		System.out.print("Enter the second number : ");
		int n2 = s1.nextInt();
		
		System.out.print("Enter the third number : ");
		int n3 = s1.nextInt();
		System.out.println("\n====================\n");
		
		//first way
		System.out.println("First Way : ");
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is greater than " + n2 + " and " + n3);
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is greater than " + n1 + " and " + n3);
		}
		else {
			System.out.println(n3 + " is greater than " + n2 + " and " + n1);
		}
		
		System.out.println("\n");
		
		//second way
		System.out.println("Second Way :");
		if(n1>n2) {
			if(n1>n3) {
				System.out.println(n1 + " is greater than " + n3 + " and " + n2);
			}
			else {
				System.out.println(n3 + " is greater than " + n1 + " and " + n2);
			}
		}
		else if(n2>n3){
			System.out.println(n2 + " is greater than " + n1 + " and " + n3);
		}
		else {
			System.out.println(n3 + " is greater than " + n1 + " and " + n2);
		}

	}

}
