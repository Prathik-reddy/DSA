import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();

        ArrayList<String> res = getMazePaths(1,1,dr,dc);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

       if(sr==dr && sc==dc){
           ArrayList<String> bres = new ArrayList<String>();
           bres.add("");
           return bres;
       }
       ArrayList<String> paths = new ArrayList<String>();
       for(int i=1;i<=dc-sc;i++){
           ArrayList<String> hpaths = getMazePaths(sr,sc+i,dr,dc);
           for(String val : hpaths){
               paths.add("h"+i+val);
           }
       }
       for(int i=1;i<=dr-sr;i++){
           ArrayList<String> vpaths = getMazePaths(sr+i,sc,dr,dc);
           for(String val : vpaths){
               paths.add("v"+i+val);
           }
       }
       for(int i=1;i<=dr-sr && i<=dc-sc ;i++){
           ArrayList<String> dpaths = getMazePaths(sr+i,sc+i,dr,dc);
           for(String val : dpaths){
               paths.add("d"+i+val);
           }
       }

       return paths;

    }

}