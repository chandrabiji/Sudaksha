package com.sudaksha.jdbc;

import java.util.Scanner;

public class Plan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ?");
		String str = sc.next();
		String str1="";
		for(int i=str.length()-1;i>=0;--i)
		{
			str1+=str.charAt(i);
		}
		if(str.equals(str1)){
			System.out.println("pal");
		}else{
			System.out.println("not pal");
		}

	}

}
