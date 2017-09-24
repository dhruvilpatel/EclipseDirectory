
public class HackerRank1 {

	public static void main(String args[]) {
		int num = 128;
		String number = String.valueOf(num);
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    System.out.println("digit: " + j);
		}
	}
}
