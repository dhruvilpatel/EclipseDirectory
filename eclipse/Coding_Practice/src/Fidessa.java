import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Fidessa {

	public static void main ( String[] args){
		String input ="AbcbA";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] c = new char[80];
		int[] count = new int[80];
		
		for(int i = 0 ; i<80 ; i++){
			c[i] = (char)(65 + i); 
		}
		
 		for (int i = 0 ; i< input.length() ; i++){
 			int index = input.charAt(i) - 'A';
 			count[index] = count[index] + 1;
		}
		for (int i = 0 ; i< c.length ; i++){
 			if(count[i]>1){
 				System.out.println(c[i]);
 				break;
 			}
		}
	}
	
}
