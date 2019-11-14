package com.sudaksha.jdbc;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] arr = {10,43,2,9,15,64};
		System.out.println("Without sorting array elements");
		for(int i:arr)
		{
			System.out.println(i);
		}
		Arrays.sort(arr);//to sort arrat element in asc
		System.out.println("After sorting Array Elements are");
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("Array Max Element");
		System.out.println(arr[arr.length-1]);
		System.out.println("Array 2nd Highest Element");
		System.out.println(arr[arr.length-2]);
		System.out.println("Array Min Element");
		System.out.println(arr[0]);
	}

}
