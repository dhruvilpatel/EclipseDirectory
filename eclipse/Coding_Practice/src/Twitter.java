import java.util.HashMap;


public class Twitter {

	public static void main (String args[]){
		String ecrypted_message = "bjj rwkcs dwpyp fwz ovors wxjs vje tcez fqg";
		if(ecrypted_message.length() == 0);{
			System.out.println("-1");
		}
		System.out.println(ecrypted_message.substring(ecrypted_message.length()-10,ecrypted_message.length()));
		StringBuilder decrypted_message = new StringBuilder();
        HashMap<Character,Integer> alphabets = new HashMap<Character,Integer>();
        char[] arr = {
          'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
        };
        
        int count = 0;
        for( char c = 'A'; c <= 'Z'; c++){
            alphabets.put(c,count);
            count++;
        }
        String key = "8251220";
        System.out.println(key);
        int index = 0;
        for (int i = 0 ; i < ecrypted_message.length(); i++){
            int key_value = Character.getNumericValue(key.charAt(index));
        
            if(alphabets.get(Character.toUpperCase(ecrypted_message.charAt(i))) != null){
            	int char_value = alphabets.get(Character.toUpperCase(ecrypted_message.charAt(i)));
            	int value = 0;
            if(char_value - key_value < 0){
            	value = char_value - key_value + 26;
            }else{
            	value = char_value - key_value;
            }
            if(!Character.isLowerCase(ecrypted_message.charAt(i))){                              
            decrypted_message.append(arr[value]);
                }
            else{
                decrypted_message.append(Character.toLowerCase(arr[value]));
            }
            if(index < key.length()-1){
                index++;
            }else{
                index = 0;
            }
                }
            else{
                decrypted_message.append(ecrypted_message.charAt(i));
            }
            
        }
        System.out.println(decrypted_message);
	}
	public static String DetermineKey(String message, HashMap<Character, Integer > hm){
		StringBuilder key = new StringBuilder();
		String input = "Hi, this is an Example";
		for (int i = 0 ; i< message.length(); i++){
			if(hm.get(Character.toUpperCase(message.charAt(i))) != null){
		int index = hm.get(Character.toUpperCase(message.charAt(i))) - hm.get(Character.toUpperCase(input.charAt(i)));
		if(index<0){
			key.append(index+26);
		}else{
		key.append(index);
		}
			}
		}
		return key.toString();
	}
}

