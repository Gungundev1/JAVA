package BasicJava.Arrays;

import java.util.Scanner;

public class MaxMinValue {
    // find the largest and smallest value in the array
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<n;i++){
            array[i]= input.nextInt();
        }
       int max=array[0];
        for (int i=1;i<n;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Largest number is: "+max);
        int min=array[0];
        for (int i=1;i<n;i++){
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println("Smallest number is : "+min);
    }
}
