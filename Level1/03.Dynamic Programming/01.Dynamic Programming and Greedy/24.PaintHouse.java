import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int houses = scn.nextInt();
        int[][] arr = new int[houses][3];
        for(int i=0;i<houses;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp =  new int[houses][3];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for(int i=1;i<houses;i++){
           dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + arr[i][0];
           dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + arr[i][1];
           dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + arr[i][2];
        }

        int min = Math.min(dp[houses-1][0],(Math.min(dp[houses-1][1],dp[houses-1][2])));
        System.out.println(min);
    }
}