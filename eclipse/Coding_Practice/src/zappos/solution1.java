package zappos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class solution1 {

		/*public static List splitAndGiveList(String number){
		int length=number.length();
		List list=new ArrayList();
		for(int i=0;i<length;i++){
		String newNum=number.substring(0,i)+number.substring(i+1,length);
		list.add(Integer.parseInt(newNum));
		}
		Collections.sort(list);
		return list;
		}

		public static void findLeast(String number,int noOfDigit){
		int leastNo=0;
		for(int i=0;i<noOfDigit;i++){
		leastNo=(int) splitAndGiveList(number).get(0);
		number=Integer.toString(leastNo);
		}
		System.out.println(leastNo);
		}
		*//**
		* @param args
		*//*
		**/
		public static void main(String[] args) {
		findLeast(746209249,4);

		}

		
		
		public static String findLeast(int inputNo, int noOfDigitsToDelete)
		{
		String s = Integer.toString(inputNo);
		int[] digits = new int[10];
		char[] s_char = s.toCharArray();
		for(char ch : s_char){
			int position = Character.getNumericValue(ch);
			digits[position] = digits[position] + 1;
		}
		int newNumLength = s.length() - noOfDigitsToDelete;
		int count = 0;
		String output = "";
		while(output.length() != newNumLength){
			if(digits[count]>0){
				output = output + count;
				digits[count] = digits[count] -1;
				
			}else{
				count++;
			}
		}
		System.out.println(output);
		return output;
		}
		
		
		
		}
	
	
	
