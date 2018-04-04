import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
	public static String solution(String S) {
        // write your code in Java SE 8
        List<String> arrayList = new ArrayList<String>();
        arrayList = generatePermutation(S.replaceAll(":","").toCharArray(),0,arrayList);
        Collections.sort(arrayList);
        for(int i = 0 ; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
            if(arrayList.get(i).equals(S.replaceAll(":",""))){
//            	if(arrayList.get(i).subStrinf(0) )
                return arrayList.get(i+1);
            }
        }
     return "";   
    }
    
    
    public static  List<String> generatePermutation(char[] c ,int x, List<String> output){
        
        if(x == c.length){
            output.add(new String(c));    
        }else{
            for(int i = x; i < c.length; i++){
                swap(c, x, i);
                generatePermutation(c,x+1, output);
                swap(c,x,i);
            }
        }
        return output;
    }
    
    public static void swap(char[] c, int a, int b){
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
    
    public static void main(String args[]){
    	System.out.println("output"+solution("01:01"));
    	
    	String[] arr = {"2359","5329"};
    	
    	Arrays.sort(arr);
    	
    	System.out.println(arr[0]);
    	
    }
}