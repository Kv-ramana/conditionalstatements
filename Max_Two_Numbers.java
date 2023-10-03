//write a program to find the max of two numbers

import java.util.Scanner;
public class Max_Two_Numbers {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter two Integers");
    int num1= sc.nextInt();
    int num2= sc.nextInt();

    if(num1 > num2){
      System.out.println(num1+"is maximum number");
    }
    else{
      System.out.println(num2+"is maximum number");
    }
    }
  }
