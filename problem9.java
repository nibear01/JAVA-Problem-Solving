
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a year: ");
        int year = input.nextInt();

        int leapYear = year%4;

        if (leapYear == 0){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
        input.close();
    }
}
