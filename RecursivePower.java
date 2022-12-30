package PatikaJava;
import java.util.Scanner;
public class RecursivePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();

        int result = recursivePower(taban, us);
        System.out.println("Sonuç = " + result);
    }

    static int recursivePower(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * recursivePower(taban, us - 1);
        }
    }
}


