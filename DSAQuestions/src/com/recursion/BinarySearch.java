package com.recursion;

public class BinarySearch {
	static int binarySearch(int arr[],int start,int end,int target) {
		if(start>end) return -1;
		
		int mid = (start+end)/2;
		if(arr[mid] == target) return mid;
		else if(arr[mid]<target) start = mid+1;
		else end = mid-1;
		
		return binarySearch(arr,start,end,target);
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 7, 9, 11};
		System.out.println(binarySearch(arr,0,arr.length-1,7));		
	}

}
