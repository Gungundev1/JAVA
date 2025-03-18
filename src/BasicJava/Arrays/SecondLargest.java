package BasicJava.Arrays;

import java.util.Arrays;

public class SecondLargest {
    static int secondLargest(int[] array){
        int n=array.length;
        Arrays.sort(array);
//        System.out.println(array[n-2]);
        for (int i=n-2;i>=0;i--){
            if (array[i]!=array[n-1]){
                return array[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array={2,6,8,15,12,70,70};
        System.out.println(secondLargest(array));
    }

}
