//wap to find maximum numbers of three numbers

import java.util.Scanner;

public class Max_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);

        scanner.close();
    }
}