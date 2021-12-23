import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
        StringBuilder s = new StringBuilder();
        s.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char cur = str.charAt(i);
            char prev= str.charAt(i-1);
            int gap = cur-prev;
            s.append(gap);
            s.append(cur);
        }
		return s.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}