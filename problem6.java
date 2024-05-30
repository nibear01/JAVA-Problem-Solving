import java.util.Scanner;

public class problem6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input floating-point number: ");
        double n1 = input.nextDouble();
        input.nextLine();
        
        System.out.print("Input floating-point another number: ");
        double n2 = input.nextDouble();
        input.nextLine();

        n1 = Math.round(n1*1000);  // taking upto 3 decimal points.
        n1 = n1 / 1000;

        n2 = Math.round(n2*1000);
        n2 = n2 / 1000;
        

        if (n1 == n2) {
            System.out.println("They are same");
        } else {
            System.out.println("They are different");
        }
        input.close();
     
    }
}
