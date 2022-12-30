package PatikaJava;

import java.util.Scanner;

public class AsalSay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı girin: ");
        int number = sc.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
}

