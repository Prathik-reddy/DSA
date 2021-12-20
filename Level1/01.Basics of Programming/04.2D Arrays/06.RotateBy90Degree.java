import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[][] = new int [n][n];

        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j] = scn.nextInt();
            }
        }
        for(int i =0;i<a.length;i++){
            for(int j=i;j<a[0].length;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int i =0;i<a.length;i++){
            int li=0;
            int ri=a[0].length-1;
            while(li<ri){
                int temp = a[i][li];
                a[i][li] = a[i][ri];
                a[i][ri] = temp;
                li++;
                ri--;
            }
        }
        display(a);

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}