import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    int diff=0;

    for(int i=0;i<n;i++){
        int elem = scn.nextInt();
        arr[i]=elem;
    }
    int max=arr[0];
    int min=arr[0];

    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
    }
    diff = max-min;
    System.out.println(diff);
 }

}