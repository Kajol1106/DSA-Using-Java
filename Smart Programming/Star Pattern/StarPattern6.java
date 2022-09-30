/*
 Output:
 Enter number : 4
   *
  **
 ***
****
 ***
  **
   *
   
 */

package com.Practice;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=n-1; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

