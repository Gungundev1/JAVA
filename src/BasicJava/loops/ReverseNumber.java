package BasicJava.loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // TO Reverse number(entered by user)
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        int rev=0;
        while(number>0){
         int r=  number%10;
        rev=(rev*10)+r;
        number=number/10;

    }
        System.out.println(rev);
    }
}
