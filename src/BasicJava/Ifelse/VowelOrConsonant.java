package BasicJava.Ifelse;

import java.util.Locale;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // to check the letter is vowel or consonant
        Scanner input=new Scanner(System.in);
       char letter=input.next().toLowerCase().charAt(0);
      if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
          System.out.println("Letter is vowel");
      }
      else
          System.out.println("Letter is consonant");
    }
}
