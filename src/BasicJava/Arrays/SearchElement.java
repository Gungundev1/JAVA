package BasicJava.Arrays;

import javax.swing.*;
import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {


        int[] array = {2, 2,4,5,7,8};
//        int element = 9;
//        int count=0;
//        for(int i=0;i<=array.length-1;i++){
//            if (i==element){
//                count++;
//            }}
//            if (count>=1) {
//                System.out.println("found  " + element);
//            }
//            else System.out.println("not found  " +element);
        Arrays.sort(array);
       if (array[0]!=array[array.length-1]){
           System.out.println("min "+array[0]);
           System.out.println("max "+array[array.length-1]);
       }
       else System.out.println("both value are same");
//       int value=array[0];
//       int i=0;
//       int n= args.length-1;
//       while( i<=n){
//           if (value<array[i]){
//               System.out.println("max"+array[i]);
//           } else if (value>array[i]) {
//               System.out.println("min"+array[0]);
//           }
//       }
    }
}
