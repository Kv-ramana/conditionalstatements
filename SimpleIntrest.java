//wrrite a java program to find the simple intrest.

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest:");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time period:");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The calculated Simple Interest is: " + simpleInterest);
    }
}
