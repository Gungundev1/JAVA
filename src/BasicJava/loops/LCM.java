package BasicJava.loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // To print all factors of a number
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println();
            }
        }
    }
}
