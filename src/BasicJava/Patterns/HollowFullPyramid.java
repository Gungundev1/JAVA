package BasicJava.Patterns;

import java.util.Scanner;

public class HollowFullPyramid {
    public static void main(String[] args) {
        // To print hollow full pyramid star pattern
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any no.");
        int n = input.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

        }
    }
}
