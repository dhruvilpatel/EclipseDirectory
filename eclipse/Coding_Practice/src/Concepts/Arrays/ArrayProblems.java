package Concepts.Arrays;

import java.util.Arrays;

public class ArrayProblems {

	public static void main( String args[]){
		
		int[] array = {12,1,2,6,4};
		int[] oddEvenArray = {2,5,7,8,1,6,9,1,6};
		int[] maxDifferenceValuesArray = {4,80,2,6,100}; 
		int[] maximumSubArray = {4, -2, 3, 4, -6, -7, -7, 8};
		minMax(array);
		equilibriumPoint(array);
		oddEven(oddEvenArray);
		maxDifferenceValues(maxDifferenceValuesArray);
		System.out.println("maximumSubArray : " + maximumSubArraySolution(maximumSubArray));
		String[] arr = {"d","dh","ab","dad"}; 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Math.floor(1+2/2));
	}
	
	public static void minMax(int[] arr){
		
		// Assuming only positive integers
		int min = arr[0]; 
		int max = arr[0] ;
		for(int i=0 ; i<arr.length; i++){
			
			if(arr[i]>max){
				max = arr[i];
			}
			else if(arr[i] <= min){
				min = arr[i];
			}
			
		}
		System.out.println("Maximum will be :" + max + "  Minimum will be :" + min);
		
		
	}
	
	public static void equilibriumPoint(int[] arr){

		int sum = 0;
		
		for(int i=0 ; i <arr.length; i++){
			sum+= arr[i];
		}
		
		int leftCount = 0; 
		
		for(int i = 0 ; i < arr.length; i++){
			
			sum -= arr[i];
			
			if(leftCount == sum){
				System.out.println("Index is :" + i + "  with value " + leftCount);
				break;
			}
			leftCount += arr[i];
			if(leftCount == sum){
				System.out.println("Index is :" + i + "  with value " + leftCount);
				break;
			}
			
		}
		
		
		int leftSum = arr[0];
		int rightSum = arr[arr.length-1];
		int start = 0 ,end = arr.length - 1;
		while( start - end <= 1){
			
			if(leftSum>rightSum){
				end--;
				rightSum+=arr[end];
			}else if(rightSum>leftSum){
				start++;
				leftSum+=arr[start];
			}
			else {
				start++;
				end--;
				rightSum+=arr[end];
				leftSum+=arr[start];
				
			}
				if(start-end<=1 && leftSum ==rightSum){
				System.out.println("Equilibrium");
			}
			
			
		}
		
	}
	
	public static void oddEven(int[] arr){
		
		int oddPos = 1, evenPos = 0;
		int len = arr.length - 1;
		
		while(oddPos < len && evenPos < len){
		
		while(evenPos<len && arr[evenPos]%2 == 0){
			evenPos +=2 ;
		}
		while(oddPos<len && arr[oddPos]%2 == 1){
			oddPos +=2 ;
		}
		// swap without using temporary
		// a  = 4 , b = 5
		// int a = a + b ; a = 9
		// int b = a - b; b = 4 
		// int a = a - b; a = 5
		if(oddPos<len && evenPos < len){
			int temp = arr[evenPos];
			arr[evenPos] = arr[oddPos];
			arr[oddPos] = temp;
		}
		else{
			break;
		}
		}
		System.out.println("Odd Even : " + Arrays.toString(arr));
		
	}
	
	public static void maxDifferenceValues(int[] arr){
		
//		int diff = arr[1] - arr[0];
//		int sum = diff;
//		int max_sum = sum;
//		
//		for(int i = 0 ; i < arr.length - 1; i++){
//			
//			diff = arr[i+1] - arr[i];
//			
//			if(sum>0){
//				sum += diff;
//			}else{
//				sum = diff;
//			}
//			
//			if(sum>max_sum) max_sum = sum;
//		}
//		System.out.println("Max Sum :" + max_sum);
		
		int max_diff = arr[1] - arr[0];
		int min_value = arr[0];
		
		for(int i=1; i< arr.length-1; i++){
			
			max_diff = Math.max(max_diff, arr[i+1] - min_value);
			min_value = Math.min(min_value, arr[i]);
			
		}
		
		System.out.println("Maximum value : " + max_diff);
		
	}
	public static int maximumSubArraySolution(int[] a){
		 int size = a.length;
//	        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
//	        int start_index = 0, end_index = 0;
//	        for (int i = 0; i < size; i++)
//	        {
//	            max_ending_here = max_ending_here + a[i];
//	            if (max_so_far < max_ending_here)
//	            	{
//	            	end_index = i;
//	                max_so_far = max_ending_here;}
//	            
//	            if (max_ending_here < 0){
//	                max_ending_here = 0;
//	            	
//
//	            }
//	        }
	        
	        		int max_ending_here = 0;
	                int max_sofar = a[0];
//	                int max_start_index = 0;
//	                int startIndex = 0;
//	                int max_end_index = -1;
	                for (int i = 0; i < size; i++){

	                    if (0 > max_ending_here + a[i]){
//	                        startIndex = i + 1;
	                    	max_ending_here = 0;
	                    }
	                    else
	                    	max_ending_here = max_ending_here + a[i];
	                    if (max_ending_here > max_sofar){
	                    	max_sofar = max_ending_here;
//	                        max_start_index = startIndex;
//	                        max_end_index = i;
	                    }
	                }
	                      

	        
	        
//	        System.out.println("Start Index : " + max_start_index +  "  End Index : " + max_end_index);
	        return max_sofar;
	}
	
	
}


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m = nums1.length;
        int n = nums2.length;
        if(m < 1 && n > 0){
            if( n % 2 == 0) return (nums2[n/2 -1] + nums2[n/2])/2;
            else return nums2[n/2 ];
        }
        
        if(n < 1 && m > 0){
            if( m % 2 == 0) return (nums1[m/2 - 1] + nums1[m/2])/2;
            else return nums1[m/2 ];
        }
        
        if(n == 1 && m == 1){
            return nums1[0] + nums2[0] / 2;
        }
        System.out.println("lenb" + m+ " " + n);
        int  i = 0 , j = 0;
        int counter = 0;
        int hit = n + m / 2;
        System.out.println("Hit"+  hit);
        while( i < m && j < n && hit != counter)    
        {
            
            if(nums1[i] <= nums2[j]) i++;
            else j++;
            
            counter++;
            System.out.println("while"+  i + " " + j + " " + counter);
        }
        
        if( j < n ) {
            
             while( j < n && hit != counter){
                j++;
                counter++;
            }
        if ((n+m) % 2  == 0) return (nums1[i-1] + nums2[j-1] / 2);
        else return (double)nums2[j];
        
        }
        else {
            
            while( i < m && hit != counter){
                i++;
                counter++;
            }
            
             if ((n+m) % 2  == 0) return (nums1[i-1] + nums2[j-1] / 2);
        else return (double)nums2[j-1];
        }
        
    }
}