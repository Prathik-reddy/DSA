import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int sp = 0;
        int bp = 0;
        int p = 0;

        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                sp++;
            }else{
                p += arr[sp] - arr[bp];
                bp = sp = i;
            }
        }

        p += arr[sp] - arr[bp];
        System.out.println(p);

    }

}