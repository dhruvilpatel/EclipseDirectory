package HackerRank;

public class StringPermutation {
	public static void main (String[] args) {
		System.out.print(R("", "abcd"));
		permutations("abcd");
		}

		public static String R(String x, String y) {
		String s = "";
		if(y.length() == 1) {
		s += x + y + " " ;
		}
		else {
		for(int i = 0; i < y.length(); i++) {
		s += R(x + y.substring(i, i + 1),
		y.substring(0, i) + y.substring(i + 1, y.length()));
		}
		}
		return s;
		}
		
		public static void permutations(String s){
			  permutations(s.toCharArray(), 0);
			}
			private static void permutations(char[] C, int idx){
			  if(idx == C.length){
			    System.out.println(new String(C));
			  } else{
			    for(int i = idx; i < C.length; i++){
			      swap(C,idx,i); // swap
			      permutations(C,idx+1);
			      swap(C,idx,i); // put back
			    }
			  }
			}
			private static void swap(char[] C, int a, int b){
			  char tmp = C[a];
			  C[a] = C[b];
			  C[b] = tmp;
			}
}
