
import java.util.Scanner;

public class problem30 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int n1 = in.nextInt();

        System.out.print("Input second number: ");
        int n2 = in.nextInt();

        System.out.print("Input third number: ");
        int n3 = in.nextInt();

        if (n1 == n2 && n1 == n3){
            System.out.println("All numbers are equal");
        } else if (n1 != n2 && n1 != n3 && n2 != n3){
            System.out.println("All numbers are different");
        } else if (n1 == n2 || n1 == n3){
            System.out.println("Neither all are equal or different.");
        }
        in.close();

    }
}
