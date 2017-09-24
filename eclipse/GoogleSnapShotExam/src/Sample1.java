import java.util.Scanner;


public class Sample1 {

	public static void main(String[] args){
        String Format = "12:50:00AM";
        String military = "";
        String[] spl = Format.split(":");

        
        if(Format.contains("PM")&&Integer.parseInt(spl[0])!=12){
            
            spl[0]= Integer.toString(Integer.parseInt(spl[0]) + 12);
            military = spl[0]+":"+spl[1]+":"+spl[2].substring(0,2);
            
        }else if (Format.contains("AM")&&Integer.parseInt(spl[0])==12){
        	spl[0]= "00";
            military = spl[0]+":"+spl[1]+":"+spl[2].substring(0,2);
        }
        else{
        	military = spl[0]+":"+spl[1]+":"+spl[2].substring(0,2);
        }
        
         System.out.println(military);
	}
	
}
