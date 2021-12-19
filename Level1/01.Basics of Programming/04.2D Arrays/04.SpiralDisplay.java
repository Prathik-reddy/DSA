import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = scn.nextInt();
        int a[][] = new int [r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = scn.nextInt();
            }
        }

        int minr=0;
        int minc = 0;
        int maxr=a.length-1;
        int maxc=a[0].length-1;

        int cnt =0;
        int total = r*c;
        while(cnt<total){
            //left wall
            for(int i=minr;i<=maxr && cnt<total;i++){
                System.out.println(a[i][minc]);
                cnt++;
            }
            minc++;
            //bottom wall
            for(int i=minc;i<=maxc && cnt<total;i++){
                System.out.println(a[maxr][i]);
                cnt++;

            }
            maxr--;

            //right wall
             for(int i=maxr;i>=minr && cnt<total;i--){
                System.out.println(a[i][maxc]);
                cnt++;

            }
            maxc--;

            //top wall
             for(int i=maxc;i>=minc && cnt<total;i--){
                System.out.println(a[minr][i]);
                cnt++;

            }
            minr++;
        }
    }

}