package BasicJava;

import java.util.Scanner;
public class TakeInput {
    public static void main(String args[]){
        System.out.println("enter any two values:");
        Scanner input=new Scanner(System.in) ;
        int a=input.nextInt();
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("sum of two values:"+sum);
    }
}
