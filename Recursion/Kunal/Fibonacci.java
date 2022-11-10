//find nth fibonacci number 
//fibonacci means sum of previous 2 number ex., 0,1,1,2,3,5,8,13


package com.KunalKhushwala;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 7;
		int ans = fib(n);
		System.out.println(ans);
	}
	
	public static int fib(int n) {
		if(n<2) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}

}
