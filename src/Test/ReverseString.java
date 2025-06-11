package Test;

import static java.util.Collections.reverse;

public class ReverseString {
//    public static void main(String[] args) {
//        int a=5;
//        int b=8;
//        System.out.println("a="+a);
//        System.out.println("b"+b);
//        a=(a+b)-(b=a);
//        System.out.println("a "+a);
//        System.out.println("b"+b);
//    public static boolean stringContainsVowel(String input){
//      return   input.toLowerCase().matches(".*[aeiou].*");
//
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(stringContainsVowel("gungun"));
//        System.out.println(stringContainsVowel("trw"));
//    }
//    public static boolean checkPrime(int num){
//
//        int count=0;
//        if(num==0||num==1)
//            return false;
//
//        for(int i=2;i<=num;i++){
//            if (num%i==0)
//                count++;
//        }
//        if (count==1){
//           return true;}
//        return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(checkPrime(9));
//    }

    public static void main(String[] args) {
        int num=8;
        int first=0;
        int second=1;
        int temp=1;
//        System.out.println(first);
//        System.out.println(second);
        for (int i=1;i<=num;i++){
            System.out.println(first);
//            int sum=first+second;
//            System.out.println(sum);
//            int temp=first;
//            first=second;
//            second=sum;
            first=second;//firsst=1
            second=temp;//second=1
            temp=first+second;


        }
    }
}
