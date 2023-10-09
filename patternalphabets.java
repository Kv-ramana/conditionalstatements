import java.util.Scanner;
public class patternalphabets {
    public static void main(String[] args) {
        System.out.println("enter no of rows and coloumns");
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        char j;
        for(int r=1;r<=row;r++)
        {
             j='a';
            for(int c=1;c<=r;c++)
            {
                System.out.print(j+" ");
                j++;
            }
            System.out.println("\n");
        }
    }
}