package BasicJava.Ifelse;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        // To find maximum  of three numbers
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first no.");
        int first= input.nextInt();
        System.out.println("Enter second no.");
        int second= input.nextInt();
        System.out.println("Enter third no.");
        int third = input.nextInt();
        if(first>second&& first>third){
            System.out.println("maximum no is first: "+first);
        }
        else if (second>third&&second>first){
            System.out.println("Maximum no. is second :"+second);
        }
        else {
            System.out.println("Maximum no. is third :"+third);
        }

    }
}
