import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Input value: ");
        double num = input.nextDouble();
        
        if (num > 0) {
            if (num < 1) {
                System.out.println("Postive small number");
            } else if (num > 1000000) {
                System.out.println("Postive large number");
            } else {
                System.out.println("Postive number");
            }
        } else if (num < 0) {
            if (Math.abs(num) < 1) {
                System.out.println("Negative small number");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        }
        
        input.close();
    }
}
