import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int minsf = arr[0];
        int[] lp = new int[arr.length];
        for(int i=1;i<n;i++){
            if(arr[i]<minsf){
                minsf = arr[i];
            }

            if(arr[i] - minsf > lp[i-1]){
                lp[i] = arr[i] - minsf;
            }else{
                lp[i] = lp[i-1];
            }
        }

        int maxsf = arr[arr.length-1];
        int[] rp = new int[arr.length];

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxsf){
                maxsf = arr[i];
            }

            if(maxsf - arr[i] > rp[i+1]){
                rp[i] = maxsf - arr[i];
            }else{
                rp[i] = rp[i+1];
             }
        }
        int mp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (lp[i] + rp[i] > mp) {
                mp = lp[i] + rp[i];
            }
        }

        System.out.println(mp);
    }

}