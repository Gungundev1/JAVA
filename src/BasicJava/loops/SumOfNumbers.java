package BasicJava.loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // To calculate sum of all digits (entered by user)
        Scanner input = new Scanner(System.in);
       int number;
        int sum=0;

        while((number=input.nextInt())>0){
            sum=sum+number;

       }
        System.out.println(sum);
        input.close();
    }
}
