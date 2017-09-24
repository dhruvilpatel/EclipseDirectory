
public class Practice {
	public static int c = 0;
	int k = 4;
	
	public static void main(String args[]){
		System.out.println(recurse("Dhruvil is smart"));;
	}
	public void Smethod(){
		
		System.out.println(Integer.toString(c+10));
		NSmethod();
	}
	
		public void NSmethod(){
		
		System.out.println(Integer.toString(k+10));
	}
		
		public static String recurse(String s)

		{
			String out="";
		int l=s.length();

		if(l==0)

		return "";

		else

		out = s.charAt(l-1) + recurse(s.substring(0,l-1));
		return out;
		}
}
