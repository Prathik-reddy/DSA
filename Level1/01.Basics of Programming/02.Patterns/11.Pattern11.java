import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int counter = 1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+"\t");
                counter++;
            }
            System.out.println();
        }

    }
}