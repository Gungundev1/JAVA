package BasicJava.Patterns;

public class NumberHalfPyramid {
    public static void main(String[] args) {
        // TO print half pyramid using no.
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
