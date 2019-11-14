package com.sudaksha.jdbc;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println("A = "+a+"\t"+"B = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("A = "+a+"\t"+"B = "+b);

	}

}
