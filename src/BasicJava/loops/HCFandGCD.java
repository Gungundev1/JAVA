package BasicJava.loops;

import java.util.Scanner;

public class HCFandGCD {
    public static void main(String[] args) {
        // To find HCF and GcD
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = input.nextInt();
        int b = input.nextInt();
        int hcf = 1;

        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
              hcf=i;
            }
        }
        System.out.println("HCF of two no. is:"+hcf);
        int gcd=1;
        for(int i=1;i<=b;i++){
            if (a % i == 0 && b % i == 0){
                gcd=gcd*i;
            }
        }
        System.out.println("GCD of two no. is:"+gcd);
    }
}
