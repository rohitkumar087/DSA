package com.recursion;

import java.util.Arrays;

public class FabonacciSeries {
	public static int fib(int n,int[] arr) {
		if(n<=1) {
			return n;
		}
		if(arr[n]!=-1) {
			return arr[n];
		}
		return arr[n]=fib(n-1,arr)+fib(n-2,arr);
	}
	public static void main(String[] args) {
//		int n=5;
//		int[] array = new int[n+1];
//		array[0]=0;
//		array[1]=1;
//		for(int a=2;a<array.length;a++) {
//			array[a]=-1;
//		}
//		fib(n,array);
//		System.out.println(n);
//		System.out.println(Arrays.toString(array));
		
		// Dynamic Programming 
//		int n=5;
//		int[] array = new int[n];
//		array[0]=0;
//		array[1]=1;
//		for(int a=2;a<array.length;a++) {
//			array[a] = array[a-1]+array[a-2];
//		}
//		System.out.println(Arrays.toString(array));
		
		
		// 
	}

}
