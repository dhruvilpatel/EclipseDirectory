import java.util.*;
import java.lang.*;
import java.io.*;

class TimeseriesDataAggregation
{
    public static void main (String[] args) throws java.lang.Exception
    {
    }
        
    public static boolean aggregate(){
        
        Scanner sc  = new Scanner();

        String input = sc.next(); 
        String[] inputarr = input.split(',');
        String startDate = inputarr[0];
	    	String endDate = inputarr[1];

        HashMap<String, String> hm = new HashMap<String, String>();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM");
    	while(sc.hasNext()){
    		String ls = sc.next();
    		String compareDate = ls.subString(0,7);
    		String info = ls.subString(11, ls.length()-1);
    		if (sdf.parse(startDate).before(sdf.parse(compareDate)) && sdf.parse(compareDate).before(sdf.parse(endDate))){

    			if(hm.containsKey(compareDate)) hm.put(compareDate, hm.get(compareDate) + "," +  info);
    			else hm.put(compareDate, info)

    		}
    	}
    	SortedSet<String> keys = new TreeSet<String>(hm.keySet());


			for (String key : keys) { 
			   String value = hm.get(key);
			}
    }
}
 