import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Input a: ");
            double a = input.nextDouble();
            input.nextLine();
            
            System.out.printf("Input b: ");
            double b = input.nextDouble();
            input.nextLine();

            System.out.printf("Input c: ");
            double c = input.nextDouble();
            input.nextLine();
            
            double result = Math.pow(b, 2) - (4.0*a*c);

            if (result > 0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0*a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0*a);
                System.out.printf("The roots are %f & %f", r1, r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0*a);
                System.out.printf("The roots is %f", r1);
            } else {
                System.out.println("The Equation have no real roots. ");
            }
        }


    }
}
