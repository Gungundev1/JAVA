package BasicJava.loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // To generate multiplication table
        Scanner input=new Scanner(System.in);
        System.out.println("what number table do you want to generate ");
        int num= input.nextInt();
        for(int i=1;i<=10;i++){
            int table=num*i;
            System.out.println(table);
        }
    }
}

