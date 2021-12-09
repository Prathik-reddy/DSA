import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int inv_no=0;
  int counter =1;
  while(n>0){
      int digit =n%10;
      inv_no+=counter*Math.pow(10,digit-1);
      n=n/10;
      counter++;

  }
  System.out.println(inv_no);


 }
}