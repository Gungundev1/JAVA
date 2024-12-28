package BasicJava.Patterns;

import java.util.Scanner;

public class InvertedHalfpyramidwithnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = input.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
