import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int r1 = scn.nextInt();
    int c1 = scn.nextInt();
    int a1[][] = new int [r1][c1];
    for(int i =0; i<r1;i++){
        for(int j=0;j<c1;j++){
            a1[i][j] = scn.nextInt();
        }
    }

    int r2 = scn.nextInt();
    int c2 = scn.nextInt();
    int a2[][] = new int [r2][c2];
    for(int i =0; i<r2;i++){
        for(int j=0;j<c2;j++){
            a2[i][j] = scn.nextInt();
        }
    }

    if(c1!=r2){
        System.out.println("Invalid input");
        return;
    }else{
    int a3[][]=new int[r1][c2];
    for(int i =0; i<a3.length;i++){
        for(int j=0;j<a3[0].length;j++){
            for(int k=0;k<c1;k++){
             a3[i][j] +=a1[i][k]*a2[k][j];
            }
        }
    }


    for(int i =0; i<a3.length;i++){
        for(int j=0;j<a3[0].length;j++){
            System.out.print(a3[i][j] + " ");
        }
        System.out.println();
    }
    }




 }

}