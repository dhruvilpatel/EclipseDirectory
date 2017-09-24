package WritingOnOwn;
import java.util.HashMap;
import java.util.Stack;
public class HashParanthesis {

	public static void main(String args[]){
		
		System.out.println(checkValid("{(})"));
		
	}
	
	public static boolean checkValid(String s){
		
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		hm.put('[', ']');
		hm.put('(', ')');
		hm.put('{', '}');
		Stack<Character> st = new Stack<Character>();
		for(int i = 0 ; i < s.length(); i++){
			if(hm.containsKey(s.charAt(i))){
				st.add(hm.get(s.charAt(i)));
			}
			else if(! st.isEmpty() && st.peek() == s.charAt(i)){
				st.pop();
			}
			else{
				return false;
			}
		}
		
		return st.isEmpty();
		
	}
	
}
