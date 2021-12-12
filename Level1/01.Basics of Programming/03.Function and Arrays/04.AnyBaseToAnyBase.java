import java.util.*;

  public class Main{

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
      System.out.println(AnyToAny(n,sourceBase,destBase));
   }

  public static int AnyToAny(int n,int b1,int b2){
      int dec = AnyToDec(n,b1);
      int dn = DecToAny(dec,b2);
      return dn;
  }
  public static int AnyToDec(int n,int b){
        int rv =0;
        int pow=1;
        while(n>0){
            int rem = n%10;
            n=n/10;
            rv+=rem*pow;
            pow=pow*b;
        }
        return rv;
  }
  public static int DecToAny(int n,int b){
        int rv =0;
        int pow=1;
        while(n>0){
            int rem = n%b;
            n=n/b;
            rv+=rem*pow;
            pow=pow*10;
        }
        return rv;
  }
  }