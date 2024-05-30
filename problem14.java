
import java.util.Scanner;

public class problem14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int num = in.nextInt();
        int multiplier = 0;

        while (multiplier<=num){  //conditioning
            System.out.printf("%d X %d = %d \n",num, multiplier, num*multiplier);
            multiplier++;  //increment
        }
        in.close();
    }
}
