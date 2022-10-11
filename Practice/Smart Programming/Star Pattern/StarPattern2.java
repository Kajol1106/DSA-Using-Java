package com.Practice;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}

/*
 Enter number : 5
 * * * * * 
 * * * * 
 * * * 
 * * 
 * 
 	
 */
