package PatikaJava;

import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Değeri girin: ");
        int n = sc.nextInt();
        int startValue = n; // ilk girilen değer

        recursiveMethod(n, startValue);
    }

    public static void recursiveMethod(int n, int startValue) {
        if (n == startValue) { // ilk girilen değeri bulunca döngüyü bitir
            System.out.println(n);
            return;
        }
        System.out.println(n);
        if (n <= 0) {
            recursiveMethod(n + 5, startValue);
        } else {
            recursiveMethod(n - 5, startValue);
        }
    }
}
