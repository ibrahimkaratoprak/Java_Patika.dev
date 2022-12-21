package PatikaJava;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int n, n1 = 0, n2 = 1, total;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Eleman Sayısını Giriniz : ");
            n = input.nextInt();
        } while (n < 0);
        System.out.print(n1 + " " + n2);
        total = n1 + n2;
        for (int i = 0; i < (n - 2); i++) {
            System.out.print(" " + total);
            n1 = n2;
            n2 = total;
            total = n1 + n2;
        }
    }
}
