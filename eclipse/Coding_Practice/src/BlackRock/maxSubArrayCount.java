package BlackRock;

public class maxSubArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-4,2,-5,0,3};
		System.out.println(maxValue(arr));

	}
	
	static int maxValue(int[] arr){
		
		int max = arr[0];
		int sofar = arr[0];
		
		for (int i : arr){
			
			sofar = Math.max(i, i+ sofar);
			max = Math.max(max,sofar);
			
		}
		
		return max;
	}

}
