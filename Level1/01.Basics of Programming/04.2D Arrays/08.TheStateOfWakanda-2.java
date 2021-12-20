import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int k=0 ,j=i;j<arr.length;k++,j++){
                System.out.println(arr[k][j]);
            }
        }
    }

}