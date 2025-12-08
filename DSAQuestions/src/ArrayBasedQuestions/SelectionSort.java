package ArrayBasedQuestions;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int nums[] = {4,5,2,7,3,9,1,3,5};
		
		for(int i=0;i<nums.length;i++) {
			int smallest = Integer.MAX_VALUE;
			int ind = -1;
			
			for(int j=nums.length-1;j>=i;j--) {
				if(nums[j]<smallest) {
					smallest=nums[j];
					ind = j;
				}
				
			}
			
			int temp = nums[i];
			nums[i]=smallest;
			nums[ind]=temp;
			
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

}
