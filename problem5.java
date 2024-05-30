
import java.util.Scanner;


public class problem5 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            int num = input.nextInt();

            switch (num) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Satuday");
                case 7 -> System.out.println("Sunday");
                default -> {
                }
            }
        }
    }
}
