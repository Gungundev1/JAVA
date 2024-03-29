package BasicJava.loops;

import java.util.ArrayList;

class primeNumber {
    public static void main(String args[]) {
        ArrayList<Boolean> prime = new ArrayList<>();
        prime.add(0, false);
        prime.add(1, false);
        int i = 2;
        while (i <=50) {
            prime.add(i, true);
            i++;
        }
        for (i = 2; i <= 50 ; i++) {
            if (prime.get(i)) {
                for (int j = i * i; j <=50 ; j = j + i) {
                    prime.set(j, false);
                }
            }
        }
        System.out.println("1 to "+50+ " prime numbers are:)");
        System.out.println();
        for (i = 0; i <=50; i++) {
            if (prime.get(i)) {
                System.out.println(i);
            }
        }
    }
}

