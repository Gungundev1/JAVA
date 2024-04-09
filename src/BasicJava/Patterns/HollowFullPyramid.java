package BasicJava.Patterns;

import java.util.Scanner;

public class HollowFullPyramid {
    public static void main(String[] args) {
        // To print hollow full pyramid star pattern
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any no.");
        int n = input.nextInt();
//        int i, j;
//        for (i = 1; i <= n; i++) {
//            for (j = 1; j <= (n - i); j++) {
//                System.out.print(" ");
//            }
//
//            for ( int k = 1; k <= i; k++) {
//                if(k==1||k==n){
//                    System.out.print("*");
//                    System.out.print(" ");
//                }
//                System.out.print(" ");
//
//            }
//            System.out.println();
//        }
//        for (i=1;i==n;i++){
//            System.out.print("*");
//        }
        for (int i=0;i<=n;i++){
           for (int j=1;j<=2*n;j++){
               if (i+j==(n+1)||j-i==(n-1)||i==n){
                   System.out.print("*");
                   System.out.print(" ");
               }
               else{
                   System.out.print(" ");
               }
           }
            System.out.println();
        }
    }
}
