import java.util.Scanner;

public class problem24 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the number: ");
            int input = in.nextInt();
            int row = input;
            
            for (int i=1; i<input+1; i++){
                row -=1;
                for (int j = 0; j<row; j++){
                    System.out.print(" ");
                }
                for (int k = 0; k<i; k++){
                    System.out.print("@");
                }
                System.out.println();
            }
        }

    }
}
