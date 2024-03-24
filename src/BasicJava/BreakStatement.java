package BasicJava;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        //sum of floating no. , greater than 0
        double sum=0.0;
        Scanner scanner=new Scanner(System.in);
       while(true){
           System.out.println("Enter a number");
           double number=scanner.nextDouble();
           if(number<0.0){
               break;
           }
           sum+=number;

       }
        System.out.println("Sum of numbers is  "+sum);
    }
}
