package BasicJava;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String args[]) {
// simple calculator using Arithmetic operators(+,-,*,/,%)
        float a, b,result;
        char symbol;
        System.out.println("Enter two values to calculate:");
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        System.out.println("Enter symbol:");
        symbol=input.next().charAt(0);
        switch (symbol){
            case '+': result=a+b;
                System.out.println(" Addition of these values is: "+result);
                break;
            case '-': result=a-b;
                System.out.println("Subtraction of these values is: "+result);
                break;
            case '*':result=a*b;
                System.out.println(" Multiplication of these values is: "+result);
                break;
            case '/': result=a/b;
                System.out.println("Divisior  of these values is: "+result);
                break;
            case '%':result=a%b;
                System.out.println("modulus of these values is: "+result);
                break;
            default:
                System.out.println("Not valid!");
        }


    }
}


