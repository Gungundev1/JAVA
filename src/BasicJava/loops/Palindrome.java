package BasicJava.loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //To check the no. is palindrome or not
        Scanner input =new Scanner(System.in);
        int number= input.nextInt();
        int num=number;
        int rev=0;
        while (number!=0){
            int r=number%10;
            rev=(rev*10)+r;
            number=number/10;
        }
        if(rev==num){
            System.out.println("No. is palindrome");
        }
        else
            System.out.println("No. is not palindrome");
    }
}
