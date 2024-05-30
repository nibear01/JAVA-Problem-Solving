import java.util.Scanner;

public class problem16 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input number of rows: ");
            int rows = in.nextInt();

            for (int i = 1; i<=rows; i++){
                for (int j = 1; j<(i+1); j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

    }
}
