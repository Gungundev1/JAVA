package BasicJava;

public class ContinueStatement {
    public static void main(String[] args) {
        //printing odd no. 1 to 20 except 5
        int i=1;
        while(i<=20){
            if(i==5){
                i++;
                continue;
            }
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}
