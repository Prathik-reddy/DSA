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
        if(sr==dr && sc == dc){
            ArrayList<String> bres =  new ArrayList<String>();
            bres.add("");
            return bres;
        }
        //[hhvvvv, hvhvvv, hvvhvv, hvvvhv, hvvvvh, vhhvvv, vhvhvv, vhvvhv, vhvvvh, vvhhvv, vvhvhv, vvhvvh, vvvhhv, vvvhvh, vvvvhh]

        ArrayList<String> hpath = new ArrayList<String>();
        ArrayList<String> vpath = new ArrayList<String>();

        if(sc<dc){
            hpath = getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vpath = getMazePaths(sr+1,sc,dr,dc);
        }

        ArrayList<String> res = new ArrayList<String>();

        for(String val : hpath){
            res.add("h"+val);
        }
        for(String val : vpath){
            res.add("v"+val);
        }
        return res;
    }

}