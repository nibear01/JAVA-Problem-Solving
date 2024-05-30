import java.util.Scanner;

public class problem25 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the number: ");
            int input = in.nextInt();
            int row = input;
            int n = input;
            
            for (int i = 1; i<input+1; i++){
                row -= 1;
                for (int j = 0; j<row; j++){
                    System.out.print(" ");
                }
                int count = i;
                for (int j = 0; j<i; j++){
                    System.out.print(count);
                    count -=1;
                }
                for (int k = 1; k<i; k++){
                    System.out.print(k+1);
                }
                System.out.println();
            }
            
            
            for (int i = 1; i<input; i++){
                n -= 1;
                for (int j = 0; j<i; j++){
                    System.out.print(" ");
                }
                for (int k = n; k>=1; k--){
                    System.out.print(k);
                }
                for (int l = 1; l<n; l++){
                    System.out.print(l+1);
                }
                System.out.println();
                
            }
        }
    }
}
