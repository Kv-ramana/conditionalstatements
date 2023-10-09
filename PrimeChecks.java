//write a java program to print the all prime numbers using array

import java.util.Scanner;
public class PrimeChecks {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n= sc.nextInt();
    int num [] = new int[n];
    System.out.println("Enter the"+ n+" elements");
    for(int i=0; i<n;i++) {
        num[i]=sc.nextInt();
        
    }
    System.out.println("The prime number is the array");
    for(int i=0;i<n;i++) {
        if(Primeclass.isPrime(num[i])) {
            System.out.println(num[i]);
        }
    }
}
}

class Primeclass {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int j=2; j<n; j++) {
            if(n%j==0) {
                isPrime = false;
            }
        }
        if(isPrime==true)
        return true;
        else 
        return false;
    }
}