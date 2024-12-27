package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        a= a.toLowerCase();
        b=b.toLowerCase();
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s1=new String(ch1);
        String s2=new String(ch2);
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
        // Complete the function
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
