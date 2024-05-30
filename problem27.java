
import java.util.Scanner;

public class problem27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int input = in.nextInt();
        
        if (input == 0){
            System.out.println("Number is zero.");
        } else if (input < 0){
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is postive.");
        }
        in.close();
    }
}
