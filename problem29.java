
import java.util.Scanner;

class problem29 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input an integer number less than ten billion: ");
        int input = in.nextInt();
        int len = String.valueOf(input).length();
        int count = 0;
        
        for (int i = 0; i<len; i++){
            count += 1;
        }
        System.out.printf("Number of digits in the number: %d",count);
        in.close();
    }  
}