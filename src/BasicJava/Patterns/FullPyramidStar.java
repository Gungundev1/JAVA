package BasicJava.Patterns;

import java.util.Scanner;

public class FullPyramidStar {
    public static void main(String[] args) {
        // To print Full pyramid Star Pattern
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the no.");
        int n= input.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
