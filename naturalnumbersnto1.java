//to print all natural numbers from  n to 1
import java.util.Scanner;
public class naturalnumbersnto1{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value");
        int n = scanner.nextInt();
        
        System.out.println("natural numbers from 1 to n");
        while(n>=1) {
            System.out.println(n + " ");
            n--;
        }
    }
}