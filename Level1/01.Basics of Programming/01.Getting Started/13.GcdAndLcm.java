import java.util.*;

    public class Main{

    public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();

      int org_n1 = n1;
      int org_n2 = n2;

      while(org_n1%org_n2!=0){
        int rem = org_n1%org_n2;
        org_n1 = org_n2;
        org_n2 = rem;

      }
      int gcd = org_n2;
      System.out.println(gcd);
      int lcm = (n1*n2)/gcd;
      System.out.println(lcm);
     }
    }