package BasicJava.Patterns;

public class HollowRectangleStar {
    public static void main(String[] args) {
        // TO print hollow rectangle star
        for (int i=0;i<3;i++){
            for (int j=0;j<9;j++) {
                if (i ==0 || i == 2||j==0 ||j==8) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                    else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
