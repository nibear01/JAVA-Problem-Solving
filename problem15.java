
import java.util.Scanner;

public class problem15 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int sumOdd = 0;

            System.out.print("Input number of terms is: ");
            int input = in.nextInt();
            int count = 0;
            int i = 1;

            System.out.printf("The odd numbers are: %d \n",input);
            while (true) { 
                if (count == 5){
                    break;
                } else {
                    if (i%2 == 1){
                        sumOdd += i;
                        count += 1;
                        System.out.println(i);
                    }
                }
                i++;   
            }
            System.out.printf("The Sum of odd Natural Number upto 5 terms is: %d",sumOdd);
        }
    }   
}
