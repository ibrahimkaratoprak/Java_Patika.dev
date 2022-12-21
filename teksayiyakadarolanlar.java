package PatikaJava;

import java.util.Scanner;

public class teksayiyakadarolanlar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        while (true) {
            System.out.print("Sayıyı giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
            if (sayi %2 == 1) {
                break;
            }
        }
        System.out.println("Toplam: " + toplam);
    }
}
