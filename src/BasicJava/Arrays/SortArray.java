package BasicJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    // To sort an array in ascending order
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
        Arrays.sort(arr);
        System.out.println("Array in ascending order");
        for ( i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
