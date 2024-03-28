package BasicJava.basicQuestion;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        //To find quotient and remainder
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number(dividend) ");
        int dividend=input.nextInt();
        System.out.println("Enter number(divisor)");
        int divisior=input.nextInt();
        int quotient =dividend/divisior;
        System.out.println("Quotient is: "+quotient);
        int remainder=dividend%divisior;
        System.out.println("Remainder is: "+remainder);
    }
}
