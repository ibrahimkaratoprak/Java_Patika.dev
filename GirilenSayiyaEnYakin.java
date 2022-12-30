package PatikaJava;

import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayiyaEnYakin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = scanner.nextInt();
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(array);
        // Dizi : {15,12,788,1,-1,-778,2,0}
        for (int i = 0; i < array.length; i++) {
            if (array[i] < n && array[i + 1] > n) {
                System.out.println(n + "sayısına en yakın olan küçük değer : " + array[i]);
                System.out.println(n + "sayısına en yakın olan büyük değer : " + array[i + 1]);
                break;
            }

        }
    }
}

