package com.recursion;

public class Factorial {
	public static int factor(int n) {
		if(n==1) return n;
		return n*factor(n-1);
	}
	public static void main(String[] args) {
		System.out.println(factor(5));
	}
}
