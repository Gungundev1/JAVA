package BasicJava.loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // To calculate sum of all digits (entered by user)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits");
       int number = input.nextInt();
       int sum=0;
       while (number!=0){
           int rem=number%10;
           sum +=rem;
           number =number/10;
       }
        System.out.println("Sum of numbers is :"+sum);
    }
}
