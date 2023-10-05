//to check whether a character is uppercase or lowercase alphabet
import java.util.Scanner;
public class uppercaseorlowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (Character.isUpperCase(inputChar)) {
            System.out.println("The character is an uppercase alphabet.");
        } else if (Character.isLowerCase(inputChar)) {
            System.out.println("The character is a lowercase alphabet.");
        } else {
            System.out.println("The character is not an alphabet.");
        }
        scanner.close();
    }
}