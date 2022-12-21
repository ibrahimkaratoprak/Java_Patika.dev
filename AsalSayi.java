package PatikaJava;

public class AsalSayi {
    public static void main(String[] args) {
        int num;
        boolean asal;
        for (num = 2; num <= 100; num++) {
            asal = true;
            for (int i = 2; i <= num /2; i++) {
                if (num % i == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(num + " ");
            }
        }
    }
}
