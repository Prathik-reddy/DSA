import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
    }

    public static ArrayList<String> getStairPaths(int n) {

       if(n==0){
           ArrayList<String> bres = new ArrayList<String>();
           bres.add("");
           return bres;
       }else if(n<0){
           ArrayList<String> bres = new ArrayList<String>();
           return bres;
       }
       ArrayList<String> path1 = getStairPaths(n-1);
       ArrayList<String> path2 = getStairPaths(n-2);
       ArrayList<String> path3 = getStairPaths(n-3);
       ArrayList<String> res = new ArrayList<String>();

       for(String val:path1){
           res.add(1+val);
       }
       for(String val:path2){
           res.add(2+val);
       }
       for(String val:path3){
           res.add(3+val);
       }
       return res;

    }

}