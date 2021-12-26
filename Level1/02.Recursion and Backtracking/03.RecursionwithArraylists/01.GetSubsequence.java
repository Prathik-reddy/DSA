import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> res = gss(s);
        System.out.println(res);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres= gss(ros);
        ArrayList<String> mres = new ArrayList<String>();

        for(String val:rres){
            mres.add(""+val);
        }
        for(String val:rres){
            mres.add(ch+val);
        }
        return mres;


    }

}