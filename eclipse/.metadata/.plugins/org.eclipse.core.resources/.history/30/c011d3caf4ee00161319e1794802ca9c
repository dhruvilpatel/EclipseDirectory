package zappos;

import java.util.HashMap;

public class solution {

	public static void main (String args[]){
		int sum = 5;
		int[]arr = {1,2,3,4,5,10}; 
		int[]arr1 = {1,2,3,4,5,10}; 
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		 for (int i=0; i<arr.length; ++i)
	        {
			 	int key = sum - arr[i];
	            if(!hm.containsKey(key)){
	            	hm.put(key, arr[i]);
	            }
	        }
		 for (int i=0; i<arr1.length; ++i)
	        {
			 	
	            if(hm.containsKey(arr1[i])){
	            	hm.get(arr1[i]);
	            	System.out.println("First: " + hm.get(arr1[i]) + " Second: " + arr[i]);
	            	break;
	            }
	        }
		 
	}
	
}
//static boolean GigawattPower(int[] batteryOne, int[] batteryTwo, int gigawattTarget) {
//
//
//}