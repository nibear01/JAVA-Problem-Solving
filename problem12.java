import java.util.Scanner;

public class problem12 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int sum = 0;
            double average = 0;
            int num;
            
            System.out.println("Input 5 Numbers: \n");
            for (int i = 1; i <=5 ; i++){
                num = in.nextInt();
                //  System.out.println(num);
                sum += i;
            }
            System.out.printf("The sum of 5 no is : %d \n",sum);
            average = sum/5;
            System.out.printf("The Average is : %f",average);
        }
    }
}
