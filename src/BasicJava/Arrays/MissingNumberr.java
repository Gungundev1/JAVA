package BasicJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class MissingNumberr {
    // To find missing number in array
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i]= input.nextInt();
        }

        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            if(arr[i]+1==arr[i+1]){
            }
            else
                System.out.println("Missing number is: "+(arr[i]+1));
        }
    }
}
