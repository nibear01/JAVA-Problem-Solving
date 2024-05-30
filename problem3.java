import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int n1 = input.nextInt();
        input.nextLine();
        
        System.out.print("Input the 2nd number: ");
        int n2 = input.nextInt();
        input.nextLine();
        
        System.out.print("Input the 3rd number: ");
        int n3 = input.nextInt();
        input.nextLine();
        
        if (n1 > n2)  {
            if (n1 > n3) {
                System.out.printf("%d is greatest", n1);
            }
        } 
        if (n2 > n1)  {
            if (n2 > n3) {
                System.out.printf("%d is greatest", n2);
            }
        } 
        if (n3 > n1)  {
            if (n3 > n2) {
                System.out.printf("%d is greatest", n3);
            }
        } 
        
        input.close();
    }
}
