package BasicJava.Patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        //To print inverted half pyramid star pattern
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
