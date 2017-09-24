package HackerRank;

public class StringPermutation {
	public static void main (String[] args) {
		System.out.print(R("", "abcd"));
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
}
