package BasicJava.loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // To calculate sum of all digits (entered by user)
        Scanner input = new Scanner(System.in);
       int number=input.nextInt();
        int sum=0;int i=1;

        while (number!=0){
            sum=sum+i;
            i++;
       }
        System.out.println(sum);

    }
}
