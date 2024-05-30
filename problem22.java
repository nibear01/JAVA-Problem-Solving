import java.util.Scanner;

public class problem22 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input number of rows: ");
            int rows = in.nextInt();
            int n = rows;
            int count = 1;
            
            for (int i = 0;i<rows; i++){
                n -= 1;
                for (int space = 0; space<n; space++){
                    System.out.print(" ");     
                }
                for (int j = 0; j<=i; j++){           
                    if (i==0||j==0) {
                        count = 1;
                    } else {
                        count = count*(i-j+1)/j;
                    }
                    System.out.print(" "+count);
                }
                System.out.println( );
            }
        }

    }
}
