package ArrayBasedQuestions;

import java.util.Arrays;
import java.util.Stack;

public class NextgreaterElement {
	public static void main(String[] args) {
		int[] arr = {1,7,3,2,6,5,4,3,7};
		int[] newArr = new int[arr.length];
		
		for(int n=0;n<newArr.length;n++) {
			newArr[n] = -1;
		}
			
		
//		for(int i=1;i<arr.length;i++) {
//			for(int j=i-1;j>=0;j--) {
//				if(arr[i]>arr[j] && newArr[j] == -1) {
//					newArr[j] = arr[i];
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(newArr));
		
		// Stack Approach
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			int val = arr[i];
			while(!s.isEmpty() && s.peek()<val) {
				int ele = s.pop();
				newArr[ele] = val;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}
