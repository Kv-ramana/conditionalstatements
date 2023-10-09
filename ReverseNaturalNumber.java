//wap to find the reverrse natural numbers n to 1

import java.util.Scanner;
public class ReverseNaturalNumber {
public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the n value");
    int n = scanner.nextInt();
    System.out.println("Reverse natural numbers from n to 1");
    while (n>=1) {
        System.out.println(n + " ");
        n--;
    }
    }
}