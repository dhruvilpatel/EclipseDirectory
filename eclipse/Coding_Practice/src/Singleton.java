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
}

class UsingSingleton{

    public static void main (String args[]){
        Singleton s = new Singleton();
        s.getInstance().Print();
    }
}
