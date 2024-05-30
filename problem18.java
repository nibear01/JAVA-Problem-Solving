import java.util.Scanner;

public class problem18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows = in.nextInt();

        int count  = 0;

        for (int i = 1; i<=rows; i++){
            for (int j = 1; j < i+1; j++){
                count += 1;
                System.out.printf("%d ", count);
            }
            System.out.println();
        }
        in.close();
    }
}
