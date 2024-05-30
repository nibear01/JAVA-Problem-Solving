import java.util.Scanner;

public class problem8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input an alphabet: ");
        String letteString = input.nextLine().toLowerCase();
       // input.nextLine();

        if (letteString.length() != 1 ){
            System.out.println("Not valid");
        } else if (letteString.equals("a") ){
            System.out.println("Input letter is Vowel");
        } else if (letteString.equals("e") ){
            System.out.println("Input letter is Vowel");
        } else if (letteString.equals("i") ){
            System.out.println("Input letter is Vowel");
        } else if (letteString.equals("o") ){
            System.out.println("Input letter is Vowel");
        } else if (letteString.equals("u") ){
            System.out.println("Input letter is Vowel");
        } else{
            System.out.println("Input letter is Consonant");
        }
        input.close();
    }
}
