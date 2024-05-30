
import java.util.Scanner;

public class problem28 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        double input = in.nextDouble();

        if (input == 0){
            System.out.println("Number is zero.");
        } else {
            if (input > 0){
                if (input < 1){
                    System.out.println("Small Positive");
                } else if (input > 1000000){
                    System.out.println("Large Positve");
                } else {
                    System.out.println("Positive");
                }
            } else {
                if (input <0){
                    if (input > -1){
                        System.out.println("Samll Negative");
                    } else if (input < -1000000){
                        System.out.println("Large Negative");
                    } else {
                        System.out.println("Negative");
                    }
                }
            }
        }

        in.close(); 
    }
}
