import java.util.*;

  public class Main{

  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int f_no = 0;
      int s_no = 1;
      int n= scn.nextInt();
      for (int i=0;i<n;i++){
          System.out.println(f_no);
          int t_no = f_no+s_no;
          f_no=s_no;
          s_no=t_no;
      }
   }
  }