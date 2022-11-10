package com.KunalKhushwala;

public class Print1ToN {

	public static void main(String[] args) {
		int n = 5;
		print(1, n);
	}
	
	public static void print(int start, int n) {
		if(start == n) {
			System.out.println(n);
			return;
		}
		System.out.println(start);
		print(start+1, n);
	}

}
