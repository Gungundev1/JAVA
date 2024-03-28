package BasicJava.Ifelse;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        // To check the no. is prime or not
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();

        int count=0;
        if (number==0||number==1){
            System.out.println("No is not prime");
        }
        else{
            for(int i=2;i<=number;i++){
                if(number%i==0){
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("No. is prime");
            }
            else{
                System.out.println("No is not prime");
            }
        }
    }
}
