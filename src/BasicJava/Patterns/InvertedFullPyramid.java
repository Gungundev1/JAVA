package BasicJava.Patterns;

import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        //TO print inverted full pyramid star pattern
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--){
                System.out.print("*");
            System.out.print(" ");

        }
        System.out.println();
    }
    }
}
