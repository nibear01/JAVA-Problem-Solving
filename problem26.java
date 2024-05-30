
import java.util.Scanner;

public class problem26 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the number: ");
            int input = in.nextInt();
            int n = input;
            int n1 = input;
            char c = 'A';
            char c1 = 'A';
            
            for (int i =  1; i <input+1 ; i++){
                n -= 1;
                for (int j = 0; j<n; j++){
                    System.out.print(" ");
                }
                for (int k = 0; k<i; k++){
                    System.out.print(c);
                    c++;
                }
                c = 'A';
                c1 += i-2;
                for (int m = i; m>1; m--){
                    
                    System.out.print(c1);
                    c1--;
                }
                c1 = 'A';
                System.out.println( );
            }
            
            for (int i = 1; i<input+1; i++){
                for (int j = 0; j<i; j++){
                    System.out.print(" ");
                }
                n1 -= 1;
                for (int k = 1; k<=n1; k++){
                    System.out.print(c);
                    c++;
                }
                c = 'A';
                c1 += n1-2;
                for (int m = n1; m>1; m--){
                    System.out.print(c1);
                    c1--;
                }
                c1 = 'A';
                System.out.println( );
            }
        }

    }
}
