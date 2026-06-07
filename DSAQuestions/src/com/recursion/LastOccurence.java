package com.recursion;

public class LastOccurence {
	static int lastOccur(int arr[],int idx,int target) {
		if(idx == 0) {
			return -1;
		}
		if(arr[idx] == target) return idx;
		return lastOccur(arr,idx-1,target);
	}
	public static void main(String[] args) {
		int arr[] = {4, 2, 7, 2, 9};
		int n = arr.length-1;
	    System.out.println(lastOccur(arr,n,2));
	}
}
