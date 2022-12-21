package PatikaJava;

import java.util.Scanner;

//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
public class uslusayihesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("üssü alınacak değeri giriniz: ");
        int n = input.nextInt();
        System.out.print("üs değeri giriniz: ");
        int k = input.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(total);
    }
}
