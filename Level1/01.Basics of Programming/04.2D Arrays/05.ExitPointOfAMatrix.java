import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int a[][] = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = scn.nextInt();
            }
        }

        int d=0;
        int i=0;
        int j=0;
        while(true){
            d=d+a[i][j]%4;

            if(d==0){
                j++;

            } else if(d==1){
                i++;
            }
            else if(d==2){
                j--;
            }
            else if(d==3){
                i--;
            }

            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }
            else if(i>=a.length){
                i--;
                break;
            }
            else if(j>=a[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);

    }

}