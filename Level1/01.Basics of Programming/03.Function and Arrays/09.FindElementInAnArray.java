import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    int found=-1;
    for(int i =0;i<arr.length;i++){
        int elem=scn.nextInt();
        arr[i]=elem;
    }
    int d = scn.nextInt();
    for(int i =0;i<arr.length;i++){
        if(arr[i]==d){
            found=i;
        }
    }
    System.out.println(found);
 }

}