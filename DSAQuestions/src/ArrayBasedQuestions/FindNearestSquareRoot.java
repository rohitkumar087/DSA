package ArrayBasedQuestions;

public class FindNearestSquareRoot {

	public static void main(String[] args) {
		int x=16;
		int i=1;
		int j=x;
		
		while(i<=j) {
			int mid = (i+j)/2;
			
			if(mid*mid==x) {
				System.out.println(mid);
			}
			else if(mid*mid<x) {
				j=mid-1;
			}
			else if(mid*mid>x) {
				i=mid+1;
			}
		}
	}

}
