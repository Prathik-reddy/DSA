import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int zeros =  1 ;
    int ones = 1;

    for(int i=2;i<=n;i++){
        int nzeros = ones;
        int nones = zeros + ones;

        zeros = nzeros;
        ones = nones;
    }

    System.out.println(zeros+ones);
 }

}