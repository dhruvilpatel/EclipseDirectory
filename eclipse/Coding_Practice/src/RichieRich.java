import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RichieRich {

	public static void main (String args[]){
		

		  
		        
		        int n = 7;
		        int k = 4;
		        String number = "0226295";
		        int arr[] = new int[n];
		        int differ = 0;
		        for ( int i = 0 ; i < n ; i++){
		            arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
		        }
		        for ( int start = 0, end = n-1 ; start < n/2 ; start++, end--){
		            if(arr[start] != arr[end]){
		                differ++;
		            }
		        }
		        int first = 0 , last = n-1;
		        if(differ>k){
		            System.out.println("-1");
		        }
		        else{
		      while(k>0 && first <= last ){
		          
		          if(differ < k ){
		              
		              if( (arr[first] != 9 && arr[last] != 9)  && k!=1){
		                  if(arr[first] != arr[last]){
		                	  differ--;
		                  }
		            	  arr[first] = 9;
		                  arr[last] = 9;
		                  k = k - 2;
		                  
		              }
		              else if ( (arr[first] == 9 || arr[last] == 9) && arr[first]!=arr[last] && k!= 1 ){
		                  arr[first] = 9;
		                  arr[last] = 9;
		                  k = k - 1;
		                  differ--;
		              }
		              else if( first == last ){
		                  arr[first] = 9;
		              }
		              first++;
		              last--;
		             
		              
		          }
		          else {
		              if(arr[first] > arr[last]){
		                  arr[last] = arr[first];
		                  k--;
		              }
		              else if(arr[first] < arr[last]){
		                  arr[first] = arr[last];
		                  k--;
		              }
		              first++;
		              last--;
		          }
		          
		      }
		            for ( int i : arr){
		                System.out.print(i);
		            }
		            }
		    }
		
	
}
