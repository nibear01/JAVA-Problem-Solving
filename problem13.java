
import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int input = in.nextInt();

        for (int i = 1; i<=input; i++){
            int cube = (i*i)*i;
            System.out.printf("Number is : %d and cube of %d is : %d \n",i,i,cube);
        }
        in.close();
    }
}
