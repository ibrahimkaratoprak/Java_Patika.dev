package PatikaJava;

import java.util.Scanner;

/*Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/
public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("C(n,r) değerlerini giriniz:\n n: ");
        int n = input.nextInt();
        System.out.print("C(n,r) değerlerini giriniz:\n r: ");
        int r = input.nextInt();

        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nrFactorial = factorial(n - r);

        int result = nFactorial / (rFactorial * nrFactorial);
        System.out.println("C(" + n + "," + r + ") = " + result);
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

