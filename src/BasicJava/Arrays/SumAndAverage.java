package BasicJava.Arrays;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        //TO calculate sum & average of array elements
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = input.nextInt();
        System.out.println("Enter elemnets of array:");
        int array[]=new int[size];
        int sum=0;
        double avg=0;
        for (int i=0;i<size;i++){
            array[i]= input.nextInt();
        }
        for (int i=0;i<size;i++){
            sum+=array[i];
        }
        System.out.println("sum of numbers is:"+sum);
        avg=sum/size;
        System.out.println("average of numbers is:"+avg);
    }
}
