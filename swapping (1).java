import java.util.Scanner;
public class swapping {
  public static void main(String args[]) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the first number : ");
    int num1 = sc.nextInt();
    System.out.println("enter the second number : ");
    int num2 = sc.nextInt();
    int num3 = num1;
    num1=num2;
     System.out.println("Before swapping: " + num3 + " , " + num1);
   
    System.out.println("After swapping: " + num2 + " , " + num3);
  }
}
