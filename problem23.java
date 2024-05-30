
import java.util.Scanner;

public class problem23 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the number: ");
            int input = in.nextInt();
            
            for (int i = input; i>0; i--){
                for (int j = input- i; j > 0; j--){
                    System.out.print(" ");
                }
                for (int k = 0; k<i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
