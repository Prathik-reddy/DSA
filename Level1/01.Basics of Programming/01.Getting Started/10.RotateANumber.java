import java.util.*;

   public class Main{

   public static void main(String[] args) {
     // write your code here
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int temp = n;
     int k = scn.nextInt();
     int nod = 0;
     int mult = 1;
     int div = 1;
     while(temp>0){
         temp=temp/10;
         nod++;
    }

    k=k%nod;
    if(k<0){
        k=k+nod;
    }

    for (int i=0;i<nod;i++){
        if(i<k){
            div = div*10;
        }
        else{
            mult = mult * 10;
        }
    }
    int rem = n%div;
    int q = n/div;
    int res = rem*mult+q;
    System.out.println(res);

    }
   }