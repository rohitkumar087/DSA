package ArrayBasedQuestions;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {14,9,15,12,6,8,13};
		for(int i=0;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
