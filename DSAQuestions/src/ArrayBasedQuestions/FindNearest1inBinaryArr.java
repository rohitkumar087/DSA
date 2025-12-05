package ArrayBasedQuestions;
// Find the nearest 1 index in given array from a particular 0
// arr[] = {0,1,0,0,1,1,1,0,1,1}

public class FindNearest1inBinaryArr {
	
	public static void main(String[] args) {
		int arr[] = {1,0,1,0,0,0,1,1,1,0,1,0,1};
		// First we start loop from right to left direction to check nearest 1 
		int index1 = 0;    // In index we store the index no of our last/nearest 1 in array
		int ans1[] = new int[arr.length];   // In this array we store the index no of 1 which is nearest 
		
		for(int i = arr.length-1;i>=0;i--) {
			if(arr[i]==1) {
				index1 = i;
			}
			else {
				ans1[i] = index1;
			}
		}
		
		System.out.println("Right to Left direction....");
		for(int n : ans1) {
			System.out.print(n+"  ");
			
		}
		System.out.println();
		
		
		// Then we start loop from right to left direction to check nearest 1
		int index2 = 0;
		int[] ans2 = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				index2 = i;
			}
			else {
				ans2[i] = index2;
			}
		}
		
		System.out.println("Left to Right direction....");
		for(int n : ans2) {
			System.out.print(n+"  ");
		}
		
		// To find the nearest 1 by checking the both right and left side 
		
		
	}

}
