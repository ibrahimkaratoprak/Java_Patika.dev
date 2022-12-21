package PatikaJava;

import java.util.Scanner;

public class Enkucuk_enbuyuksayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı karşılaştıracaksınız: ");
        int n = input.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ". sayıyı giriniz: ");
            int number = input.nextInt();


            if (number < min) {
                min = number;
            }
            if (number> max) {
                max = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}

