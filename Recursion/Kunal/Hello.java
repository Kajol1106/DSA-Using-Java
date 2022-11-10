package com.KunalKhushwala;


// If we want to print 1, 2, 3, 4, 5. In simple programming we can call it like this but if there is more elements we want to 
// then we can't write more functions so there recusrsion will use in very less code
public class Hello {
	public static void main(String[] args) {
		//print();
//		for(int i=0; i<=5; i++) {
//			print();
//		}
		//with simeple program
		//print(1);
		
		//with recursion
		printElements(1);
	}
	
	public static void printElements(int n) {
		if(n == 5) {
			System.out.println(5);
			return;
		}
		System.out.println(n);
		printElements(n+1);
	}
	
//	public static void print(int n) {
//		System.out.println(n);
//		print1(2);
//	}
//	
//	public static void print1(int n) {
//		System.out.println(n);
//		print2(3);
//	}
//	
//	public static void print2(int n) {
//		System.out.println(n);
//		print3(4);
//	}
//	
//	public static void print3(int n) {
//		System.out.println(n);
//		print4(5);
//	}
//	public static void print4(int n) {
//		System.out.println(n);
//	}
}
