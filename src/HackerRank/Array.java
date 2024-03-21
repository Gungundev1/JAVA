package HackerRank;

import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        int n;  int i;
        // System.out.println("enter no.of elements:");
        Scanner input =new Scanner(System.in);
        n=input.nextInt();
        int a[]=new int[5];
        // System.out.println("enter elements:");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.print(a[i] +" ");
        }
    }
}