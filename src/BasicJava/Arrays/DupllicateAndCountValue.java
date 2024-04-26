package BasicJava.Arrays;

import java.util.Scanner;

public class DupllicateAndCountValue {
    // To find duplicate value and count of duplicate value
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for (int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        int count=0;int j;
        for (int i=0;i<n;i++){
            for (  j=i+1;j<n;j++) {
                if (arr[i] == arr[j]) count++;
            }

//                System.out.println(arr[j] +"->"+count);


        }

        System.out.println("Duplicate values: "+count);


    }
}
