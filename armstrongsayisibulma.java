package PatikaJava;

import java.util.Scanner;

public class armstrongsayisibulma {

    public static void main(String[] args) {
        int toplam = 0;
        for (int number = 100; number < 1000; number++) {
            int basNumber = 0;
            int tempNumber = number;
            int basValue;
            int result = 0;
            int basPow;

            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }

            tempNumber = number;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if (result == number) {
                System.out.println(number + " sayısı bir Armstrong sayıdır.");
                toplam += number;
            }
        }

        System.out.println("Armstrong sayılarının toplamı: " + toplam);
    }
}
