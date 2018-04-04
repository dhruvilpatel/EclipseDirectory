import java.util.*;
import java.lang.*;
import java.io.*;

class Singleton
{
    private static Singleton singleton = null;
    private String m = "Dhruvil";

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
            return singleton ;  
        } else{
            return singleton;
        }
    }

    protected void Print(){
        System.out.println(m);
    }

    public static void main (String args[]){
        Singleton s = new Singleton();
        s.getInstance().Print();
        Singleton s1 = new Singleton();
        s1.getInstance().Print();
    }
}
