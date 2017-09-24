package WritingOnOwn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
// Palidrome - reads same from back
// Anagram = have same character in different order
public class StringProblem {

	public static void main(String args[]){
		findFirstNotRepeatedCharacter("Dhruvil");
		containsAllUniqueCharacterORNot("Dhruvil");
		isPermutation("Dfhruviul","rDhuflviu");
		replaceSpaceWith20("Mr John Smith     ");
		System.out.println("IS PAlidrome :" + isPalidrome("dhruurhd"));
		System.out.println("IS PAlidrome Recursively :" + isPalidromeRecursive("dhruurhd",0,7));
	}
	
	public static void findFirstNotRepeatedCharacter(String s){
		
		// will return randomized character that is not repeated wont maintaing order.
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	
		for(int  i = 0 ; i<s.length(); i++){
			
			if(hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i),hm.get(s.charAt(i)) + 1 );
			}
			else{
				hm.put(s.charAt(i), 1);
			}
			
		}
		
		
		for(char c : hm.keySet()){
			if(hm.containsKey(c) && hm.get(c)==1){
				System.out.println("First Non Repeated Character is using HashMap: " + c);
				break;
			}
		}
		
		// without HashMap if character order matters as it appears;
		
		HashSet<Character> hm1 = new HashSet();
		ArrayList<Character> al = new ArrayList();
		for(int  i = 0 ; i<s.length(); i++){
			// will continue once we store value in hashmap
			if(hm1.contains(s.charAt(i))){
				continue;
			}
			
			if(al.contains(s.charAt(i))){
				al.remove((Character)s.charAt(i));
				hm1.add(s.charAt(i));
			}
			else{
				al.add(s.charAt(i));
			}
			
		}
		
				if(al.size()>0)
				System.out.println("First Non Repeated Character is using ArrayList: " + al.get(0));
				
				
				
		// Find first non repeated alphabetically character 
				int[] flag = new int[256];
				
				for(int i=0; i<s.length(); i++){
					flag[s.charAt(i)]++;
				}
				for(int i=0; i<flag.length; i++){
					if(flag[i]==1) System.out.println("First Non Repeated Character Alphabatically : "+ (char)i);
				}
	}
	
	public static void containsAllUniqueCharacterORNot(String s){
		// We can ask if the string is ascii and unicode
		// depending on that we know that if string is greater that that it will containg duplicates character
		// for eg ascii has 256 character so if string length is greater that that it will have duplicates character
		ArrayList hm = new ArrayList();
		boolean flag = true;
		
		for(int i=0; i<s.length(); i++){
			if(hm.contains(s.charAt(i))){
				flag = false;
				break;
			}else{
				hm.add(s.charAt(i));
			}
		}
		if (flag)
		System.out.println("String contains All Unique Character");
		else
			System.out.println("String contains Duplicated Character");

		
	}
	// Is same for chercking Anagram
	public static void isPermutation(String s1, String s2){
		
		// Can also do by sorting both string and comparing each character by character
		
		boolean flag = true;
		
		ArrayList hm = new ArrayList();
		
		for(int i = 0 ; i < s1.length(); i++){
			
				hm.add(s1.charAt(i));
			
		}
		for(int i = 0 ; i < s2.length(); i++){
			if(hm.contains(s2.charAt(i))){
				hm.remove((Character)s2.charAt(i));
			}
			else{
				System.out.println("Not A permutation");
			}
			
		}
		
//		HashMap hm = new HashMap();
//		
//		for(int i = 0 ; i < s1.length(); i++){
//			if(hm.containsKey(s1.charAt(i))){
//				hm.put(s1.charAt(i),hm.get(s1.charAt(i) + 1 ));
//			}
//			else{
//				hm.put(s1.charAt(i), 1);
//			}
//		}
//		for(int i = 0 ; i < s2.length(); i++){
//			if(hm.containsKey(s2.charAt(i))){
//				hm.put(s2.charAt(i),hm.get(s2.charAt(i) - 1 ));
//			}
//			else{
//				flag = false;
//			}
//		}
		
		if (hm.size()==0)
			System.out.println("Permutations");
		else
			System.out.println("Not Permutations");
		
		
		// Checking by creating ascii character array
		if (s1.length() != s2.length()) {
			System.out.println("Second Solution Not Permutation");
			}
			int[] letters = new int[256]; // Assumption
				char[] s_array = s1.toCharArray();
			for (char c : s_array) { // count number of each char in s.
			 letters[c]++;
			 }
			
			 for (int i = 0; i < s2.length(); i++) {
			 int c = (int) s2.charAt(i);
			 if (--letters[c] < 0) {
			 System.out.println(" Second Solution Not Permutation");
			 }
			 }
			 
			 
		
	}
	
	public static void replaceSpaceWith20(String s){
		
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (String st : words){
			sb.append(st + "%20"); 
			
		}
		
		System.out.println(sb.toString());
		
		
	}
	public static boolean isPalidrome(String s){
		
		for(int start = 0, end = s.length()-1 ; start < end; start++, end--){
			
			if(s.charAt(start) != s.charAt(end)){
				System.out.println("Not a Palidrome");
			return false;
			}
			
		}
		return true;
		
	}
	public static boolean isPalidromeRecursive(String s, int start, int end){
		
		if( s.length() <= 1) return true;
		boolean flag;
	
		if(start>=0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)){
			flag = isPalidromeRecursive(s.substring(1,s.length()-1),start, end-2);
			
		}
		else{
			return false;
		}
		
		return flag;
	}
}
