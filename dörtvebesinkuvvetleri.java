package PatikaJava;
//Ödev
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;

public class dörtvebesinkuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değer giriniz: ");
        int sinirdeger = input.nextInt();
        for (int i = 1; i < sinirdeger; i *= 4) {
            System.out.println(i);
        }
        for (int i = 1; i < sinirdeger; i *= 5) {
            System.out.println(i);
        }

    }
}

