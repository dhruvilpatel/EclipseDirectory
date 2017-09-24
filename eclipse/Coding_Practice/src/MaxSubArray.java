
public class MaxSubArray {

	
	
	public static void main (String args[]){
		
		 int[] arr =  {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		 /*	int[] arr =  {1,2,3,4}; 
	*/
/*		int[] arr =  {-1,-2,-3,-4};
*/		/*int[] arr =  {1,2,3,4};
		int[] arr =  {1,2,3,4};*/
	int [] check = check_Maxsubarray(arr);
		System.out.println("Iteratively" + find_maximum_subarray_iterative(arr) );
		System.out.println("Afterwards: "+calculatingForPlusOne(check,5,arr));
		System.out.println(arr.length);
		System.out.println(arr.length/2);
		System.out.println(find_maximum_subarray_brute(arr, 0, arr.length));
		System.out.println(find_maximum_crossing_subarray(arr, 0, arr.length/2,arr.length));
		System.out.println("Alternatively : " + find_maximum_crossing_subarray_alternatively(arr, 0, arr.length/2,arr.length - 1));
		
		System.out.println("Recursively : " + find_max_subarray(arr, 0, arr.length-1));
//		
	}
	
	static int[] check_Maxsubarray(int[] arr){
		int here = 0;
		int sofar = Integer.MIN_VALUE;
		int[] sofarvalues = new int[arr.length];
		for (int i = 0 ; i <arr.length ; i++){
			
			if(i == 0){
			here = Math.max(here + arr[i], Integer.MIN_VALUE);
			/*int sofarvalue = sofar[i];*/
			}
			else{
				here = Math.max(here + arr[i], arr[i]);
			}
			sofar = Math.max(here,sofar);
			sofarvalues[i] = sofar;
			
		}  
		return sofarvalues;	

		
	}
	static int find_maximum_subarray_iterative(int[] arr){
		int here = 0;
		int sofar = arr[0];
		for (int i = 0 ; i <arr.length ; i++){
			
			
			
				here = Math.max(here + arr[i], arr[i]);
			
			sofar = Math.max(here,sofar);
			
		}  
		return sofar;	

		
	}
	static int calculatingForPlusOne(int[] max_arr, int additional , int[] orignal_array){
		int add = 0;
		int top = max_arr[max_arr.length-1];
		System.out.println("Intially: "+top);
		if(top>=0){
		for (int i = max_arr.length-1 ; i>=0 ; i--){
			if(i == 0 || top != max_arr[i-1]){
				break;
			}
			add += orignal_array[i];
		}
		
		if(add + additional>0){
			return max_arr[max_arr.length-1]+add + additional;
		}
		}
		else{
			return Math.max(top,additional);
		}
		
		return max_arr[max_arr.length-1];
		
	}
	
	static int find_maximum_subarray_brute(int[] A, int low, int high ){
		int[] Sum_arr = new int[500];
		int count = 0;
		int max = A[0];
		for ( int i = low ; i < high ; i++ )
		{
			int update = 0;
			for ( int j = i ; j < high ; j++){
				update = A[j] + update;
				Sum_arr[count] = update;
				if(max<Sum_arr[count]){
					max = Sum_arr[count];
				}
				count++;
			}
		}
		

		
		return max;
	}
	
	static int find_maximum_crossing_subarray(int[] A, int low, int mid, int high){
		
		System.out.print("here");
		
		int here_left = 0;
		int sofar_left = A[0];
		int here_right = 0;
		int sofar_right = A[mid];
		int index_i = 0;
		int index_j = mid;
		for ( int i = mid; i >= low ; i--){
			here_left = Math.max(here_left + A[i], A[i]);
			if(here_left>sofar_left){
				sofar_left = here_left;
				index_i = i;
				
			}
			
		}
		for ( int i = mid+1; i < high ; i++){
			here_right = Math.max(here_right + A[i], A[i]);
			if(here_right>sofar_right){
				sofar_right = here_right;
				index_j = i;
				
			}
			
		}
		
		System.out.println("I is : " + index_i + "  and J is : " + index_j);
		return Math.max(Math.max(sofar_left,sofar_right),sofar_left+sofar_right);
	}
	static int find_maximum_crossing_subarray_alternatively(int[] A, int low, int mid, int high){
	
		int left_sum = Integer.MIN_VALUE;
		int sum = 0;
		int max_left = 0;
		for ( int i = mid ; i>=low ; i--){
			sum = sum + A[i];
			 
			if( sum >left_sum){
				left_sum = sum;
				max_left = i;
			}
		}
		int right_sum = Integer.MIN_VALUE;
		sum = 0;
		int max_right = 0;
		
		for(int i = mid  + 1 ; i<=high ; i++){
			sum = sum + A[i];
			
			if(sum>right_sum){
				right_sum = sum;
				max_right = i;
			}
		}
		
		return  Math.max(Math.max(left_sum, right_sum), left_sum + right_sum);
		}
	
	static int find_maximum_subarray_recursive(int[] A, int low , int high){
			int mid = A.length;
		
			find_max_subarray(A, low, mid );
		
		return 0;
	}
	
	static int find_max_subarray( int[] A ,  int low , int high){
		
		if(low == high){
			return A[low];
		}
		int left_sum = find_max_subarray( A, low, (low+high)/2);  
		int right_sum = find_max_subarray( A, (low + high)/2+1, high);
		int cross = find_maximum_crossing_subarray_alternatively(A, low,(low + high)/2 ,high);

		
		return Math.max(Math.max(left_sum, right_sum), cross);
	}
	/*public static int FindMaxSumSubArray(int[] array, int low, int high){
		 
	      No element in the array 
	     if (low > high)  
	        return 0;
	      One element in the array 
	     if (low == high) 
	        return Math.max(0, array[low]);
	        
	      Middle element of the array    
	     int middle = (low + high) / 2;
	    
	      find maximum sum crossing to left 
	     int leftMax  = 0, sum =0;
	     for (int i = middle; i >= low; i--) {
	        sum += array[i];
	        if (sum > leftMax)
	            leftMax = sum;
	     }
	    
	      find maximum sum crossing to right 
	     int rightMax = 0;
	    sum = 0;
	     for (int i = middle+1; i <= high; i++) {
	        sum += array[i];
	        if (sum > rightMax)
	            rightMax = sum;
	     }
	     
	      Return the maximum of leftMax, rightMax and their sum 
	     return Math.max(leftMax + rightMax, 
	     Math.max(FindMaxSumSubArray(array, low, middle), FindMaxSumSubArray(array,middle+1, high)));
	 }*/
}