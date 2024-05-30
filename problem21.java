
import java.util.Scanner;

public class problem21 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input number of rows (half of the diamond) : ");
            int rows = in.nextInt();
            int n = rows +1;
            
            for (int i = 1; i<=rows; i++){
                n -= 1;
                for (int j = 1; j<n; j++){
                    System.out.print(" ");
                }
                for (int k = 0; k<(2*i)-1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
            for (int i = rows-1; i>=1; i--){
                for (int k = 0; k<rows-i; k++){
                    System.out.print(" ");
                }
                for (int j =1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
