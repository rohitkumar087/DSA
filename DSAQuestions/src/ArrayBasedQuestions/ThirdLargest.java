package ArrayBasedQuestions;

import java.util.Arrays;

public class ThirdLargest {

	public static void main(String[] args) {
		int nums[] = {4,6,1,8,7,8,6};
		Arrays.sort(nums);   // First sort the array sorted arr = {1,4,6,6,7,8,8}
		
		int thirdLargest = nums[nums.length-1];  // Store the largest element in the variable 
		int dist = 1;  // To check unique/distinct element
		
		// Then start the loop num.length-2 means from 2nd last index in array to 0
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i] != nums[i+1]) {  // if current element is not equal to its next element so increase dist with 1
				dist++;    
			}
			
			if(dist == 3) {   // if dist becomes 3 so store nums[i] into the thirdLargest variable
				thirdLargest = nums[i];
			}
		}
		System.out.println("Third largest no : "+thirdLargest);		
	}

}
