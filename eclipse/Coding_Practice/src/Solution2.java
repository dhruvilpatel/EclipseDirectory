class Solution2 {
    public void solution(int[] P, int K) {
        // write your code in Java SE 8
        int[][] out = fillSlots(P);
        
        for(int i = 0 ; i < out.length - 1; i++){
            for(int j = 0 ; j < out.length - 1; j++){
                
                if(P[i] == i){
                    filled[j][i] = 1;
                }
                
            }
        
            
        }
        
    }
    
    
    public int[][] fillSlots(int[] P){
        
        int[][] filled = new int[P.length - 1][P.length - 1];
        
        // i = columns, j = rows
        for(int i = 0 ; i < P.length - 1; i++){
            for(int j = 0 ; j < P.length - 1; j++){
                
                if(P[i] == i){
                    filled[j][i] = 1;
                }
                
            }
        
            
        }
        return filled;
    }
    
    
    public static void main(String args[]){
    	
    }
}