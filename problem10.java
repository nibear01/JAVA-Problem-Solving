import java.util.Scanner;

public class problem10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter range: ");
        int range = in.nextInt();

        System.out.printf("The first %d natural numbers are: \n",range);
    
        for (int i = 1; i<= range ; i++){
            System.out.println(i);
        }

        in.close();
    }
}
