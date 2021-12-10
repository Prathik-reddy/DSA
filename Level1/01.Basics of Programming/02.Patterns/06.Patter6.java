import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n= scn.nextInt();
        int star = n/2+1;
        int spc=1;

        for(int i =1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=spc;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                star--;
                spc+=2;
            }else{
                star++;
                spc-=2;
            }
            System.out.println();
        }


    }
}