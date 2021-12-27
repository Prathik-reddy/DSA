import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printKPC(s,"");
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);

        String codesForCh = codes[ch-'0'];

        for(int i=0;i<codesForCh.length();i++){
            char chOfcode = codesForCh.charAt(i);
            printKPC(roq,ans+chOfcode);
        }
    }

}