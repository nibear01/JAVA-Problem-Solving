import java.util.Scanner;

public class problem11 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int sum = 0;

            System.out.print("Input number: ");
            int num = in.nextInt();

            System.out.printf("The first %d natural numbers are: \n",num);

            for (int i = 1; i<=num; i++){
                sum = sum + i;
                System.out.println(i);
            }
            System.out.printf("The sum of Natural Number upto n terms : %d",sum);
        }
    }   
}
