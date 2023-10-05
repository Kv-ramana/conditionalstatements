import java.util.Scanner;
public class naturalnumbers {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the n number :");
    int sum=0;
    int n = scanner.nextInt();
    
    int i=1;
    
    while(i<=n) {
      sum=sum+i;
      i++;
    }
    System.out.println("natrual numbers is" +sum);
  }
}