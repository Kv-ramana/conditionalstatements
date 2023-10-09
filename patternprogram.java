import java.util.Scanner;
public class patternprogram {
    public static void main(String[] args) {
        System.out.println("enter no of rows and coloumns");
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        for(int r=1;r<=row;r++)
        {
            for(int c=1;c<=r;c++)
            System.out.print("*"+" ");
            System.out.println("\n");
        }
    }
}