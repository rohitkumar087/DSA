package ArrayBasedQuestions;

// Find the largest sequence of 1 in an binary array.
// arr[] = {1,0,1,1,1,1,0,0,0,1,1,0,1}
// output = 4

public class LargestSequenceOf1InArr {

	public static void main(String[] args) {
		// So first we create an array 
		int arr[] = {1,0,1,1,1,1,0,0,0,1,1,0,1};
		
		int count = 0;      // counts the current streak of consecutive 1s
        int max = 0;        // stores the maximum streak found so far
		
        // Loop through each element of the array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {    // Checks array each elements with the 1
				count++;     // If condition is true so count+1
			}
			else {
				max = Math.max(count, max); // When a 0 occurs, compare current count with max
				count = 0;  // Reset count since the sequence of 1s is broken
			}
			
		}
		
		// Print the longest sequence of continuous 1s
		System.out.println(max);
	}
}
