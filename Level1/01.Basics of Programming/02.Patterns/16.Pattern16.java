import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n= scn.nextInt();
     int st=1;
     int spc=2*n-3;

     for(int i = 1;i<=n;i++){
        int val = 1;
        for(int j=1;j<=st;j++){
            System.out.print(val+"\t");
            val++;
        }
        for(int j=1;j<=spc;j++){
            System.out.print("\t");
        }
        if(i==n){
            st--;
            val--;
        }
        for(int j=1;j<=st;j++){
            val--;
            System.out.print(val+"\t");
        }
        spc-=2;
        st++;
        System.out.println();
     }

 }
}