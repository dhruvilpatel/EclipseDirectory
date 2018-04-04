import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank1 {

	public static void main(String args[]) {
		int num = 128;
		char c = 'A';
		int[] arr = {1,2,3};
		String number = String.valueOf(num);
		String charac = String.valueOf(c);
		String array = String.valueOf(arr);
		System.out.println(number + " " + charac + " " + Arrays.toString(arr));
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		
		System.out.println("Al" + Arrays.toString(al.toArray()));
		
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    System.out.println("digit: " + j);
		}
	}
}
