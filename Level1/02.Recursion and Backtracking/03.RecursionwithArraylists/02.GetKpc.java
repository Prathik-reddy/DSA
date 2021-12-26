import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> res = getKPC(s);
        System.out.println(res);

    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};                                                        //#

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> a1 = new ArrayList<String>();
            a1.add("");
            return a1;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<String>();

        String codeForCh = codes[ch-'0'];
        for(int i=0;i<codeForCh.length();i++){
            char chOfCode = codeForCh.charAt(i);
            for(String val: rres){
                mres.add(chOfCode+val);
            }
        }
        return mres;
    }

}