import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.math.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;


public class learnmethods {
 
		public static void main(String args[]){
			/*Scanner sc = new Scanner(System.in);

			SumofTwoNumbers( 5, 7);
			PrintName(sc.nextLine());
			ReplaceSpace("Mr John Smith");
			
			ReturnCompressed("aabccaa ");
			
			ScannerInputMatrix();*/
			
			 int index = 'e'-'a';
			 
			int[] arr= new int[15];
			int[] new_arr = {-4, 3, -9, 0, 4, 1};
			System.out.println(Integer.toString(index));
			System.out.println((twoSum(new_arr,5)));
			System.out.println("lengthOfLongestSubstring"+Integer.toString(lengthOfLongestSubstring("abcdaef")));
			System.out.println(intToRoman(3750));
			
			String str = "Dhruvil";
			 String reverseStr = new StringBuffer(str).reverse().toString();
			
			reverseStr = reverseRecursively(str);
			
			int value = 4;
	        for(int i = value; i > 0 ; i--){
	        	System.out.println("in for loop");
	            int count = 0;
	            StringBuffer sb = new StringBuffer();
	            while(true){
	                if(count < i-1){
	                sb.append("D");
	                    count++;
	                }else if(count<value){
	                    sb.append("#");
	                    count++;
	                }
	                else{
	                	System.out.println("we are here");
	                    System.out.println(sb.toString());
	                    break;
	                }
	            }
	            }
	        }
		public static String reverseRecursively(String str) {

	        //base case to handle one char string and empty string
	        if (str.length() < 2) {
	            return str;
	        }

	        return reverseRecursively(str.substring(1)) + str.charAt(0);

	    }


	
		public static void  SumofTwoNumbers(int a, int b){
			
			System.out.println("Here it is " + (a+b));
			System.out.println(10 + 'F' - 'A');
		}
		public static void PrintName(String name){
System.out.println(name);
		}
	public static void ReplaceSpace(String s){
		String[] word= s.trim().split(" ");
		String sentence = "";
		for ( String words : word){
			sentence += words + "%20"; 
		}
		System.out.println(sentence);
	}
	
	public static void ReturnCompressed(String s){
		
		int count = 0;
		String sentence = "";
		char lastchar = s.charAt(0);
		for ( int i = 1 ; i < s.length() ; i++){
			if (s.charAt(i) == lastchar){
				count++;
			}else{
				count++;
				sentence += lastchar + Integer.toString(count);			
				lastchar = s.charAt(i);
				count = 0;
			}
		}
		if(sentence.length()<s.length()){
		System.out.println(sentence);
		}else{
			System.out.println(s);
			
		}
		
	}
	
	public static void ScannerInputMatrix(){
	int [][] arr = new int [5][5];
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0 ; j < 5 ; j++ ){
				Scanner sc = new Scanner(System.in);
					arr[i][j] = sc.nextInt();
			}
			System.out.println("\n");
		}
		for (int i = 0 ; i < 5 ; i++){
			String temp = "";
			for (int j = 0 ; j < 5 ; j++ ){
				temp += arr[i][j]  + " ";
			}
			System.out.println(temp);

			System.out.println("\n");
		}
		
	}
	public static int Fibo( int n){
		if(n == 0 || n == 1 ) return 1;
		
		else return Fibo(n - 1) 
				+ Fibo(n - 2);
		
	}
	public static int countWays(int n) {
		if (n < 0) {
		return 0;
		} else if (n == 0) {
		return 1;
		} else {
		return countWays(n - 1) + countWays(n - 2) +
		countWays(n - 3);
		}
		}
	public static int countWaysDP(int n, int[] map) {
		if (n < 0) {
		return 0;
		} else if (n == 0) {
		return 1;
		} else if (map[n] > 0) {
		return map[n];
		} else {
		map[n] = countWaysDP(n - 1, map) +
		countWaysDP(n - 2, map) +
		countWaysDP(n - 3, map);
		return map[n];
		}
		}
	public static String twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] indexes = new int[2];
        String output="";
        for( int i = 0 ; i < len; i++){
            if(nums[i]>target)
            continue;
            for(int j = i ; j < len ; j++ ){
                if(nums[i] + nums[j] == target)
                {
                	indexes [0] = i;
                	indexes[1]=j;
                	output = Integer.toString(i) + " " + Integer.toString(j);
                }
                
            }
            
           
        }
        return output;
    }
/*public static String lengthOfLongestSubstring(String s) {
        String substring = Character.toString(s.charAt(0));
        
        for ( int i = 1 ; i< s.length() ; i++){
        String index =	Character.toString(s.charAt(i));
        	if(substring.contains(index)){
        		
        		int value = substring.indexOf(index);
        		substring = substring.substring(value+1)+ index;
        		
        	}else{
        		substring += index;
        	}
        	
        }
        
        
	return substring;
    }*/
	
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
public String convert(String s, int numRows) {
        
	for ( int i = 0 ; i <s.length() ; i++ ){
		if(i%numRows==0){
			
		}
	}
	
	return "";
    }

public static String intToRoman(int num) {
    String result = "";
	String[] romans = {"I","V","X","L","C","D","M"};
	int index = 0;
	while (num > 0) {
		int temp = num % 10;
		switch (temp) {
		case 1:
			result = romans[index] + result;
			break;
		case 2: 
			result = romans[index] + romans[index] + result;
			break;
		case 3:
			result = romans[index] + romans[index] + romans[index] + result;
			break;
		case 4:
			result = romans[index] + romans[index + 1] + result;
			break;
		case 5:
			result = romans[index + 1] + result;
			break;
		case 6: 
			result = romans[index + 1] + romans[index] + result;
			break;
		case 7:
			result = romans[index + 1] + romans[index] + romans[index] + result;
			break;
		case 8:
			result = romans[index + 1] + romans[index] + romans[index] + romans[index] + result;
			break;
		case 9:
			result = romans[index] + romans[index + 2] + result;
			break;
		default:	
		}
		num = num / 10;
		index = index + 2;
	}
	return result;
}
public static int romanToInt(int num) {

	return 0;
}
}
