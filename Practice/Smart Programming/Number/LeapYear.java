package com.practice.java;
import java.util.Scanner;

//WAP to find year is leap or not

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter the Year : ");
		int year = s1.nextInt();
		
		//first way
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
			System.out.println(year + " year is a leap year");
		}
		else {
			System.out.println(year + " year is not a leap year");
		}
		
		
		//second way
		if(year%4 == 0) {
			if(year%400 == 0) {
				if(year%100 != 0) {
					System.out.println(year + " year is a leap year");
				}
				else {
					System.out.println(year + " year is a not a leap year");
				}
			}
		}
		else {
			System.out.println(year + " year is not a leap year");
		}

	}

}
