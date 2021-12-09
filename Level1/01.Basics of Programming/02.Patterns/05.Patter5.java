import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp=n/2;
        int star = 1;
        for(int i =1;i<=n;i++){
            for(int j = 0;j<sp;j++){
                System.out.print("\t");
            }
            for(int k = 0;k<star;k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                star+=2;
                sp--;
            }else{
                star-=2;
                sp++;
            }

        }

    }
}