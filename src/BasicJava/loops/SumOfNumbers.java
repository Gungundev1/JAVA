package BasicJava.loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        //sum of first n natural numbers
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number whereas print");
        int n= input.nextInt();
        int i=1;
        while (i<=n){
            System.out.println(i);
            i++;
        }

    }
}
