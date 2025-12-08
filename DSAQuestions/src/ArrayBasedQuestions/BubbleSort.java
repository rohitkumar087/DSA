package ArrayBasedQuestions;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int nums[] = { 2, 4, 1, 4, 7, 6, 9, 5 };

			for (int i = nums.length - 1; i >= 0; i--) {
				int largest = Integer.MIN_VALUE;
				int ind = -1;
				for (int J = 0; J <= i; J++) {
					if (nums[i] > largest) {
						largest = nums[i];
						ind=i;
					}
				}
				int temp = nums[i];
				nums[i] =largest;
				nums[ind]= temp;
				
			}
			
			System.out.println(Arrays.toString(nums));
	}

}
