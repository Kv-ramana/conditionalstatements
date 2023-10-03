import java.util.Scanner;
public class marks {
public static void main(String args[]) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter the marks");
    int percentage = scanner.nextInt();
    if(percentage>=90) {
        System.out.println("Grade A");
    }
    else if(percentage>=80) {
        System.out.println("Grade B");
    }
    else if(percentage>=70) {
        System.out.println("Grade C");
    } else if(percentage>=60) {
        System.out.println("Grade D");
    } else if(percentage>=50) {
        System.out.println("Grade E");
    } else if(percentage<=40) {
        System.out.println("Grade F");
    } 
}
}