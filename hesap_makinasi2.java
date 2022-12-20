package PatikaJava;

import java.util.Scanner;

public class hesap_makinasi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.print("Birinci sayı:");
        a = input.nextDouble();
        System.out.print("Diğer Sayı:");
        b = input.nextDouble();
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Yapmak istediğiniz işlemin numarasını giriniz:");
        int islemno = input.nextInt();
        switch (islemno) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.print("0'a bölünmez! ");
                } else {
                    System.out.println(a / b);
                }
                break;
        }
    }
}
