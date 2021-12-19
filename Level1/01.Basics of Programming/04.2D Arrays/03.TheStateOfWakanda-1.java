import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int r = scn.nextInt();
    int c = scn.nextInt();
    int a[][] = new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j] = scn.nextInt();
        }
    }

    for(int k =0 ; k<a[0].length;k++){
       if(k%2==0){
           for(int j=0;j<a.length;j++){
               System.out.println(a[j][k]);
           }
       }else{
           for(int j=a.length-1;j>=0;j--){
               System.out.println(a[j][k]);
           }
       }
    }
 }

}