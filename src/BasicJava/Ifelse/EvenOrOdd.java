package BasicJava.Ifelse;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
//         To check the no. is even or odd
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=input.nextInt();
        if(number%2==0){
            System.out.println("No. is even");
        }
        else
            System.out.println("No. is odd");

            }
        }

