package BasicJava.loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //To calculate factorial of a number
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to calculate factorial:");
        int n= input.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        System.out.println(fact);
    }
}
