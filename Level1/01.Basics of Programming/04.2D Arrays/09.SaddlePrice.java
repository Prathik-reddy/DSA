import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]=scn.nextInt();
			}
		}

		for(int i=0;i<arr.length;i++){
			int low = 0;
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][low]>arr[i][j]){
					low = j;
				}
			}
			boolean flag = true;
			for(int k=0;k<arr.length;k++){
				if(arr[k][low]>arr[i][low]){
					flag=false;
					break;
				}
		}
		if(flag){
			System.out.println(arr[i][low]);
			return;
		}
		}
		System.out.println("Invalid input");
	}
}