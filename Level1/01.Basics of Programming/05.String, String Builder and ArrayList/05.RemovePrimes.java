import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> a1){
		// write your code here
        for(int i=a1.size()-1;i>=0;i--){
            if(isPrime(a1.get(i))){
                a1.remove(i);
            }
        }
	}
	public static boolean isPrime(int a){
		// write your code here
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}