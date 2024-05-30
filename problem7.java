import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a month number: ");
        int month = input.nextInt();
        //input.nextLine();
        
        System.out.print("Input a year: ");
        int year = input.nextInt();
        //input.nextLine();

        int leapYear = year%4;
        String monthString;

        monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        
        if (leapYear == 0) {
            if (month == 2) {
                System.out.printf("%s %d has 29 days", monthString, year);
            } else {
                System.out.printf("%s %d has 30 days", monthString, year);
            }
        } else if (leapYear != 0) {
            if (month == 2) {
                System.out.printf("%s %d has 28 days", monthString, year);
            } else {
                System.out.printf("%s %d has 30 days", monthString, year);
            }
        }
        input.close();
    }
} 
        
       

