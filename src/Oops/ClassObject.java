package Oops;

import java.util.Scanner;

// simple program to sum using class and object
class Add{
    void sum(int a,int b){
        int sum= a+b;
        System.out.println(" Sum of two numbers: "+sum);
    }

}
public class ClassObject {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
       Add obj=new Add();
        obj.sum(a,b);
    }
}

