package Concepts.Arrays;

public class MedianOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,9,11,13,15,17,19};
		int[] arr1 = {7};
		
		System.out.println(findMedian(arr,arr1));
		
	}
	
	static int findMedian(int[] A, int[] B){
		
		int m = A.length;
		int n = B.length;
		
		if (m>n) {
			int[] tmp = A;
			int tmplen = m;
			A = B;
			B = tmp;
			m = n;
			n = tmplen;
			
		}
		
		int min = 0, max = m , middle = (m + n + 1)/2;
		int max_left = 0, min_right = 0;
		while(min <= max){
			
			int i = (min + max)/2;
			int j = middle - i;
			
			if( i < m && B[j-1] > A[i]) min = i + 1;
			else if( i > 0 && A[i-1] > B[j]) max = i - 1;
			else{ 
				if( i == 0) max_left = B[j - 1];
				else if(j == 0) max_left = A[i - 1];
				else max_left = Math.max(A[i - 1], B[j - 1]);
				
			
			if( (m + n)%2 == 1)return max_left;
			
			if( i == m ) min_right = B[j];
			else if(j == n) min_right = A[i];
			else{
				min_right = Math.min(A[i],B[j]);
			}
			}
		}
		
		
		return (max_left + min_right) / 2;
	}

}
