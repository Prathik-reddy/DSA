import java.util.*;

    public class Main{

    public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int temp = n;
      int digits = 0;
      while(n>0){
          digits ++;
          n=n/10;
      }
      int div = (int)Math.pow(10,digits-1);
      while(temp>0){
          int quot = temp/div;
          System.out.println(quot);
          temp = temp%div;
          div = div/10;
      }
     }
    }