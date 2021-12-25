import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int idx = arr.length;
        displayArrReverse(arr,idx);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==0){
            return;
        }

        System.out.println(arr[idx-1]);
        displayArrReverse(arr,idx-1);

    }

}