package BasicJava.Ifelse;

import java.util.Scanner;

public class LeapyearOrNot {
    public static void main(String[] args) {
        //To check year is leap year or not
        Scanner input=new Scanner(System.in);
        int year= input.nextInt();
        if(year%4==0||(year%400==0&&year%4==0)){
            System.out.println(year+" is leap year");
        }
        else
            System.out.print(year+" is not leap year");
       
    }
}
