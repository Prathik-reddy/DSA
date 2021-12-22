import java.io.*;
import java.util.*;

public class Main {

	public static String toggle(String str){
		// write your code here
        StringBuilder s = new StringBuilder(str);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch>='a' && ch<='z'){
                char uch = (char)('A'+ch-'a');
                s.setCharAt(i,uch);
            }else{
                char lch = (char)('a'+ch-'A');
                s.setCharAt(i,lch);
            }
        }
		return s.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggle(str));
	}

}