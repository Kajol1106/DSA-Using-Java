package com.KunalKhushwala;

public class Print1ToN {

	public static void main(String[] args) {
		int n = 5;
		print(1, n);
		print1(n);
	}
	
	//1st way
	public static void print(int start, int n) {
		if(start == n) {
			System.out.println(n);
			return;
		}
		System.out.println(start);
		print(start+1, n);
	}
	
	//2nd way
	public static void print1(int n) {
		if(n == 1) {
			System.out.println(n);
			return;
		}
		print1(n-1);
		System.out.println(n);
	}

}
