package ArrayBasedQuestions;

public class PrefixSum {

	public static void main(String[] args) {
		// Prefix sum 
		int arr[] = {7,8,9,10,11,12,13,14};
		int sumOfArr[] = new int[arr.length];
		
		sumOfArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
		    sumOfArr[i] = sumOfArr[i - 1] + arr[i];
		}
		
		for(int n : sumOfArr) {
			System.out.print(n+" ");
		}
	}

}
