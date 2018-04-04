package PureStorage;

public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPalindromes("hellolle"));
	}

	public static int countPalindromes(String a) {
		int globalCount = a.length();
		for (int mid = 1; mid < a.length() - 1; mid++) {
			int count = 0;

			int low = mid - 1;
			int high = mid + 1;
			while (low >= 0 && high < a.length() && a.charAt(low--) == a.charAt(high++))
				count++;

			globalCount += count;
			count = 0;

			low = mid - 1;
			high = mid;
			while (low >= 0 && high < a.length() && a.charAt(low--) == a.charAt(high++))
				count++;

			globalCount += count;
		}

		return globalCount;
	}
}
