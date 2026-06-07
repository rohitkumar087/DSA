package com.recursion;

public class FirstOccurence {
	static int firstOccur(int arr[],int idx,int target) {
		if(idx == arr.length-1) {
			return -1;
		}
		
		if(arr[idx] == target) return idx;
		return firstOccur(arr,idx+1,target);
	}
	public static void main(String[] args) {
		int arr[] = {4,3,-2,5,6,-2};
		System.out.println(firstOccur(arr,0,-2));
	}

}
