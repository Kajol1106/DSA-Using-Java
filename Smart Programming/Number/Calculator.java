package com.practice.java;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to generate calculator
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1 = s1.nextInt();
		
		System.out.print("Enter second number : ");
		int num2 = s1.nextInt();
		
		System.out.print("Enter Symbol which you want to perform operation : ");
		String symbol = s1.next();
		
		int res;
		
		switch (symbol) {
		case "+" :
			res = num1 + num2;
			System.out.println("Addition is : " + res);
			break;
			
		case "-" :
			res = num1 - num2;
			System.out.println("Substraction is : " + res);
			break;
			
		case "*" :
			res = num1 * num2;
			System.out.println("Multiplication is : " + res);
			break;
			
		case "/" :
			res = num1 / num2;
			System.out.println("Division is : " + res);
			break;
			
		case "%" :
			res = num1 % num2;
			System.out.println("Remainder is : " + res);
			break;
			
		default :
			System.out.println("Invalid symbol");
			break;
		}

	}

}
