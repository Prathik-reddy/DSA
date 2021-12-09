import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for(int i =n;i>0;i--){
            int sp=n-i;
            int star = i;
            for(int j = 0;j<sp;j++){
                System.out.print("\t");
            }
            for(int k = 0;k<star;k++){
                System.out.print("*\t");
            }
            System.out.println();

        }

    }
}