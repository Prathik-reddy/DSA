import java.util.*;

  public class Main{

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

       // write ur code here
       int t = scn.nextInt();
       for (int i=0;i<t;i++){
           int n = scn.nextInt();
           if(n<=3){
                System.out.println("prime");
           }
           for(int j=2;j<=n/2;j++){
            if(n%j==0){
                System.out.println("not prime");
            }else{
                System.out.println("prime");
                break;
                }
            }
       }
   }
}