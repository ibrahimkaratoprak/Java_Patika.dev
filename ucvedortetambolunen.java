package PatikaJava;
import java.util.Scanner;
public class ucvedortetambolunen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int sayac = 0;
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        double ortalama = (double) toplam / sayac;
        System.out.println("Ortalama: " + ortalama);
    }
}
