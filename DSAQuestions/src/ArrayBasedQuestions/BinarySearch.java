package ArrayBasedQuestions;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int i = 1;
		int j = arr.length-1;
		int f = 10;
		
		while(i<=j){
			int mid = (i+j)/2;
			
			if(f == arr[mid]) {
				System.out.println("Key " + arr[mid] + " Occur at " + mid + " index");
				break;
			}
			
			else if(f > arr[mid]) {
				i=mid+1;
				j=arr.length-1;
			}
			
			else if(f < arr[mid]) {
				i=0;
				i=mid-1;
			}
			
			System.out.println(i+" "+j);
		}
		
	}

}
