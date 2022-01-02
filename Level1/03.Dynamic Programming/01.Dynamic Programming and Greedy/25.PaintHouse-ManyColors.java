import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int houses = scn.nextInt();
        int colors = scn.nextInt();

        int arr[][] = new int[houses][colors];

        for(int i=0;i<houses;i++){
            for(int j=0;j<colors;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[houses][colors];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = arr[0][i];
        }


        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                int min = Integer.MAX_VALUE;
                for(int k=0;k<dp[0].length;k++){
                    if(j!=k){
                        if(dp[i-1][k]<min){
                            min = dp[i-1][k];
                        }
                    }
                }
                dp[i][j] = arr[i][j] + min;
            }
        }

        int min = Integer.MAX_VALUE;
        for ( int k = 0; k < dp[0].length; k++) {
            if (dp[houses - 1][k] < min) {
                min = dp[houses - 1][k];
            }
        }

        System.out.print(min);



    }
}