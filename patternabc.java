import java.util.Scanner;
public class patternabc {
    public static void main(String[] args) 
    {
     
     Scanner scanner=new Scanner(System.in);
     System.out.println("enter the rows");
     int num1=scanner.nextInt();
     System.out.println("enter the columns");
     int num2=scanner.nextInt();
     int n=1;
     for(int i=1;i<=num1;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.printf("%d",n);
             n++;
         }
         System.out.println();
     }
    }
}