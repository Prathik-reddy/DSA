import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int otr_spc = n/2;
     int innr_spc = -1;

     for(int i = 1 ; i<=n;i++){

         for(int j=1;j<=otr_spc;j++){
             System.out.print("\t");
         }

         System.out.print("*\t");

         for(int j=1;j<=innr_spc;j++){
             System.out.print("\t");
         }
         if(i>1 && i<n){
             System.out.print("*\t");
         }

         if(i<=n/2){
             otr_spc--;
             innr_spc+=2;
         }else{
             otr_spc++;
             innr_spc-=2;
         }
         System.out.println();
     }

 }
}