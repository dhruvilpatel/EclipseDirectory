public class CompareBinToHex {
	public static void main(String[] args) {
		System.out.println(compareBinToHex("1111","F"));
	}
	public static boolean compareBinToHex(String binary, String hex) {
		int nl = convertToBase(binary, 2); 
		int n2 = convertToBase(hex, 16); 
		if (nl < 0 || n2 < 0) { 
			return false;
	}
	else {
		return nl == n2;
	}
	}
	public static int digitToValue(char c) 
	{ 
		if (c >= '0' && c <= '9') 
			return c - '0';
					else if (c >= 'A' && c <= 'F') 
					return 10 + c - 'A'; 
							else if (c >= 'a' && c <= 'f')
								return 10 + c - 'a';
							return -1;
	}
	public static int convertToBase(String number, int base)
	{ 
		if (base < 2 || (base > 10 && base != 16)) 
			return -1; 
		int value = 0;
		for (int i = number.length() - 1; i >= 0; i--)
		{
			int digit = digitToValue(number.charAt(i)); 
			if (digit < 0 || digit >= base) 
				 return -1; 
				 int exp = number.length() - 1 - i; 
				 value += digit * Math.pow(base, exp);
						 }
			return value; 
			}
	}						
	

				

