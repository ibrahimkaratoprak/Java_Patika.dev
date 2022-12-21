package PatikaJava;

import java.util.Scanner;

public class Ebob_ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayı: ");
        int a = input.nextInt();
        System.out.print("İkinci Sayı: ");
        int b = input.nextInt();
        int ebob = 1;
        if (a >= b) {
            int i = 1;
            while (i <= b) {
                i++;
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }
            System.out.print("EBOB:" + ebob);

        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }
            System.out.print("a ve b sayılarını ebob değeri: " + ebob);
        }
        int ekok = 1;
        for (int i = 1; i <= (a * b); i++) {
            if (i % a == 0 && i % b == 0) {
                ekok = i;
                System.out.println("\nEKOK:" + ekok);
                break;
            }
        }
    }


}



