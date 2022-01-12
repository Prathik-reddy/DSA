import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] dp = new int[n+1];
    System.out.println(fibo(n,dp));
 }
public static int fibo(int n , int[] dp){
    if(n==0||n==1){
        return n;
    }
    if(n<0){
        return 0;
    }
    if(dp[n]!=0){
        return dp[n];
    }

    int fibo1 = fibo(n-1,dp);
    int fibo2 = fibo(n-2,dp);
    int fibo = fibo1 + fibo2;

    dp[n] = fibo;
    return dp[n];

}
}