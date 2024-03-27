package BasicJava.basicQuestion;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        //perform arithmetic operations
        Scanner input =new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a =input.nextInt();
        int b= input.nextInt();
        System.out.println("Addition of two numbers is: "+(a+b));
        System.out.println("subtraction of  two numbers is: "+(a-b));
        System.out.println("Multiplication of  two numbers is: "+(a*b));
        System.out.println("Division of  two numbers is: "+(a/b));
        System.out.println("Modulus of  two numbers is: "+(a%b));
    }
}
