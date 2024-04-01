package BasicJava.Patterns;

public class HalfPyramidStar {
    public static void main(String[] args) {
        //To print half pyramid star pattern
        for (int i=1;i<6;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
