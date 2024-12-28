package BasicJava.Patterns;

import java.util.Scanner;

public class HalfPyramidwithNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = input.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
