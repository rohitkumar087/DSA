package com.recursion;

public class CountNumOccurence {
	static int countOcccurence(int arr[],int idx,int target) {
		if(idx == arr.length-1) return 0;
		
		int count = 0;
		if(arr[idx] == target) count+=1;
		return count+countOcccurence(arr,idx+1,target);
	}

	public static void main(String[] args) {
		int arr[] = {4, 2, 7, 2, 9, 2,2,2};
		System.out.println(countOcccurence(arr,0,2));

	}

}
