package BasicJava.loops;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        //To check the no. is Armstrong or not
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any number");
        int number= input.nextInt();
        int num=number;
        int sum=0;
        while (number!=0){
            int r=number%10;
            sum=sum+(r*r*r);
            number=number/10;
        }
        if(sum==num){
            System.out.println("No. is Armstrong");
        }
        else
            System.out.println("No. is not Armstrong");
    }
}
