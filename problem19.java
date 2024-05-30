
import java.util.Scanner;

public class problem19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter row range: ");
        int row = in.nextInt();
        int n = row + 1;
        
        for (int i = 1; i<=row; i++){
            n -= 1;
            System.out.print(n);
            for (int k = 0; k < n; k++){
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++){
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
        in.close();
    }
}
