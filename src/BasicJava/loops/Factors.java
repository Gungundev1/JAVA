package BasicJava.loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // TO display all factors of a number
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no.");
        int number=input.nextInt();
        for(int i=1;i<=number;i++){
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
