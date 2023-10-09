//wap to find the natural numbers 1 to n

import java.util.Scanner;
public class NaturalNumbers {
public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the n value");
    int n = scanner.nextInt();
    int i = 1;
    System.out.println("Natural numbers 1 to n");
    while(i<n) {
        System.out.println(i + " ");
        i++;
    }
}
}
