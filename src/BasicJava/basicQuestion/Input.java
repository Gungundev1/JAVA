package BasicJava.basicQuestion;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //print integer and string value entered by user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer value");
        int n=input.nextInt();
        System.out.println(n);
        System.out.println("Enter any string value");
        String s=input.next();
        System.out.println(s);
    }
}
