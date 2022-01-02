import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();

    long zeros = 1;
    long ones = 1;

    for(long i=2;i<=n;i++){
        long nzeros = ones;
        long nones = ones + zeros;

        zeros = nzeros;
        ones = nones;

    }

    long total = ones + zeros;
    total = total * total;

    System.out.println(total);
 }

}