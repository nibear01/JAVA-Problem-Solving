
import java.util.Scanner;

public class problem32 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first floating­point number: ");
        double n1 = in.nextDouble();

        System.out.print("Input second floatingpoint number: ");
        double n2 = in.nextDouble();

        if (Math.abs(n1 - n2) <= 0.01) { 
            System.out.println(Math.abs(n1 - n2));
            //System.out.println("These numbers are the same."); 
        } else { 
            System.out.println("These numbers are different.");
        }
    }
}
