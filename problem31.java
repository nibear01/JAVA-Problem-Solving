import java.util.Scanner;

public class problem31 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int n1 = in.nextInt();

        System.out.print("Input second number: ");
        int n2 = in.nextInt();

        System.out.print("Input third number: ");
        int n3 = in.nextInt();

        if (n1 < n2 && n2 < n3){
            System.out.println("Incresing order.");
        } else if (n1 > n2 && n2 > n3){
            System.out.print("Decreasing order.");
        } else if (n1 < n2 || n2 > n3){
            System.out.println("Neither increasing or decreasing order.");
        }
        in.close();
    }
}
