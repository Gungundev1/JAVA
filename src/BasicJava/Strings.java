package BasicJava;
import java.lang.String;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name=new String("      Gungun    ");
        Scanner scanner=new Scanner(System.in);
      String name1 =scanner.next();
        System.out.println(name1);
//       functions of a string
        System.out.println("length of name is  "+name1.length());//return length of the string
        
        System.out.println("in lowercase  "+name1.toLowerCase());//return string with lowercase
        
        System.out.println("in uppercase  "+name1.toUpperCase());//return string with uppercase
        
        System.out.println("before trim  "+name);//return string
        
        System.out.println("after trim  "+name.trim());//return string with removing all spaces
        
        System.out.println("substring is  "+name1.substring(2));//return substring with starting index
        
        System.out.println("substring is  "+name1.substring(1,4));//return substring b/w stating to ending index
        
        System.out.println("replacing  "+name1.replace('t','m'));//replace old character to new character
        
        System.out.println("start with ni  "+name1.startsWith("ni"));//return true or false
        
        System.out.println("ends with ni  "+name1.endsWith("ha"));//return true or false
        
        System.out.println("print character  "+name1.charAt(2));//return a character of the index no
        
        System.out.println(name1.indexOf("an"));//return a character from that index
        
        System.out.println(name1.lastIndexOf("n"));//return first occurrence of the string
        
        System.out.println(name.lastIndexOf("a",6));//return last occurrence of the string
        
        System.out.println("if name is equal  "+name1.equals("tanisha"));//return true or false
        
        System.out.println(name1.equalsIgnoreCase("Tanisha"));//return true or false , ignoring the lowercase or uppercase
        
    }
    String[] obj=new String[5];
}
