package com.KunalKhushwala;

public class PrintNTo1 {

	public static void main(String[] args) {
		int n = 5;
		int last = 1;
		print(n, last);
	}
	
	public static void print(int n, int last) {
		if(n==last) {	//base condition
			System.out.println(last);
			return;
		}
		System.out.println(n);
		print(n-1, last);
	}

}
