import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        int stars=n;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=stars; j++){
                System.out.print("*	");
            }
            stars--;
            System.out.println();
        }

    }
}