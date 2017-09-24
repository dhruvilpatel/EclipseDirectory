/*
 * Complete the function below.
 */

    static String decrypt(String encrypted_message) {
    
        if(encrypted_message.length() == -1) return "";
        HashMap<Character,Integer> alphabets = new HashMap<Character,Integer>();
        // char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
         
        int count = 0;
        for( char c = 'A'; c <= 'Z'; c++){
            alphabets.put(c,count);
            count++;
        }
       String key = determineKey(encrypted_message , alphabets);
        System.out.println("Key" + key);
        return "-1";
    }


    public static String determineKey(String encrypted_message, HashMap<Character,Integer> alphabets){
        System.out.println("encrypted_message" + encrypted_message);
        StringBuilder key = new StringBuilder();
        // String[] signature = encrypted_message.split("-");
        String encrypted = "AtvthrqgseCnikg";
        String decrypted = "YourfriendAlice";
        // System.out.println("Encrypted String" + encrypted);
        for(int i = 0 ; i< encrypted.length() - 1; i++){
            char enc = encrypted.charAt(i);
            char dec = decrypted.charAt(i);
            if (alphabets.get(Character.toUpperCase(enc)) != null){
                int position = alphabets.get(Character.toUpperCase(enc)) - 
                    alphabets.get(decrypted.charAt(Character.toUpperCase(dec)));
                if (position < 0) key.append(position + 26);
                else key.append(position);  
                
            }
            
        }
        
       
        
        return key.toString();
    }