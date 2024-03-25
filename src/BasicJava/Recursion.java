package BasicJava;

import java.util.Scanner;

public class Recursion {
  static int factorial(int n) {
        if (n < 0 || n == 1) {
            return 1;
        }
        else {
            return n* factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter any no. to get factorial:");
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
            System.out.println("factorial of "+m+" is "+factorial(m));



        }

    }

