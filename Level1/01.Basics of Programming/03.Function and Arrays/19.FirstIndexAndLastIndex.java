import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
    }

    int d = scn.nextInt();
    int low = 0;
    int high = a.length-1;
    int floor = -1 ;

    while(low<=high){
        int mid = (high+low)/2;

        if(d>a[mid]){
            low = mid +1;
        }else if(d < a[mid]){
            high = mid-1;
        }else{
            floor = mid;
            high = mid-1;
        }
    }
    System.out.println(floor);

    low = 0;
    high = a.length-1;
    int ceil = -1 ;

    while(low<=high){
        int mid = (high+low)/2;

        if(d>a[mid]){
            low = mid +1;
        }else if(d < a[mid]){
            high = mid-1;
        }else{
            ceil = mid;
            low = mid+1;
        }
    }
    System.out.println(ceil);
 }

}