
public class group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,5,4,2};
//		solution(arr,2);
		System.out.println(solution(arr,1));
	}
	
	 public static int solution(int[] P, int K) {
	        // write your code in Java SE 8
	       int[] flags = new int[P.length];
	       System.out.println(flags.length);
	       int answer = -1;
	       for(int  i = 0 ; i <= P.length - 1; i++){
	    	   
	    	   flags[P[i] - 1] = 1;
	    	   if(checkGroup(flags, K)) answer = i;
	       }
	       for(int i = 0 ; i <= flags.length - 1; i++){
	    	   System.out.println(flags[i]);
	       }
	        return answer;
	    }
	 public static boolean checkGroup(int[] flag, int k){
		 
		 int prev = flag[0];
		 int counter = 0;
		 for(int i = 0 ; i < flag.length - 1; i++){
			 
			 if(flag[i] == 1){
				 counter++;
			 }
			 else if(counter == k) return true;
			 else return false;
		 }
		 return false;
		 
	 }

}
