package BasicJava.basicQuestion;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        //swap two variable without using third variable
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first value");
        int a=input.nextInt();
        System.out.println("Enter second value");

        int b= input.nextInt();
        a=(a+b)-(b=a);
        System.out.println("first value "+a);
        System.out.println("second value "+b);
    }
}
