package BasicJava;

import java.util.Scanner;
public class Loop {
    //    To print fibonacci series
    public static void main(String args[]) {
        int i;
        System.out.println("enter the value of n:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

