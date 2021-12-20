import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();

        shellRotate(arr,s,r);
        display(arr);
    }

    public static void shellRotate(int arr[][],int s,int r){
        int oneD[] = fillOnedFromShell(arr,s);
        rotate(oneD,r);
        fillShellFromOned(arr,s,oneD);
    }

    public static void rotate(int oneD[],int r){
        r=r%oneD.length;
        if(r<0){
            r=r+oneD.length;
        }
        reverse(oneD,0,oneD.length-r-1);
        reverse(oneD,oneD.length-r,oneD.length-1);
        reverse(oneD,0,oneD.length-1);
    }

    public static void reverse(int oneD[],int low,int high){
        while(low<high){
            int temp = oneD[low];
            oneD[low] = oneD[high];
            oneD[high] = temp;
            low ++;
            high --;
        }
    }

    public static int[] fillOnedFromShell(int arr[][],int s){


        int minr = s-1;
        int maxr = arr.length - s;
        int minc = s-1;
        int maxc = arr[0].length-s;
        int size =2*(maxr - minr + maxc-minc);
        int oneD[] = new int[size];

        //lw
        int ind =0;
        for(int i=minr,j=minc;i<=maxr;i++){
           oneD[ind] = arr[i][j];
            ind++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++){
           oneD[ind] = arr[i][j];
            ind++;
        }
        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--){
           oneD[ind] = arr[i][j];
            ind++;
        }
        //tw
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
           oneD[ind] = arr[i][j];
            ind++;
        }
        return oneD;
    }


    public static void fillShellFromOned(int arr[][],int s,int oneD[]){


        int minr = s-1;
        int maxr = arr.length - s;
        int minc = s-1;
        int maxc = arr[0].length-s;

        //lw
        int ind =0;
        for(int i=minr,j=minc;i<=maxr;i++){
             arr[i][j]=oneD[ind];
            ind++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++){
           arr[i][j]=oneD[ind];
            ind++;
        }
        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--){
           arr[i][j]=oneD[ind];
            ind++;
        }
        //tw
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
           arr[i][j]=oneD[ind];
            ind++;
        }

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