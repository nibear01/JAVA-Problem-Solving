import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num < 0) {
            System.out.printf("%d is a negative number", num);
        } else {
            System.out.printf("%d is a Postive number", num);
        }

        scanner.close();
    }
}
