package BasicJava.Arrays;

import java.util.Scanner;

public class ReverseArray {
//     to reverse an array
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        int i=0;
        for ( i = 0; i<n; i++){
            arr[i]= input.nextInt();
        }
        System.out.println("Array is:");
        for (i=0;i<n;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int first=0;
        int last=n-1;
        while (first< last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
//            System.out.print(temp + " ");
            first++;
            last--;
        }
        System.out.println("Reverse Array is:");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }

    }
}
