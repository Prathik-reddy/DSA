import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = scn.nextInt();
        }
        int profit = 0;
        int pist = 0;
        int least = prices[0];

        for(int i=0;i<prices.length;i++){
            if(prices[i]<least){
                least = prices[i];
            }
            pist = prices[i] - least;

            if(pist>profit){
                profit = pist;
            }

        }
        System.out.println(profit);
    }

}