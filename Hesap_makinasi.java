package PatikaJava;
import java.util.Scanner;
public class Hesap_makinasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik,tarih;
        Scanner input=new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz:");
        mat=input.nextInt();
        System.out.print("fizik notunuzu giriniz:");
        fizik=input.nextInt();
        System.out.print("kimya notunuzu giriniz:");
        kimya=input.nextInt();
        System.out.print("turkce notunuzu giriniz:");
        turkce=input.nextInt();
        System.out.print("müzik notunuzu giriniz:");
        muzik=input.nextInt();
        System.out.print("tarih notunuzu giriniz:");
        tarih =input.nextInt();
        int toplam=(mat+fizik+kimya+turkce+muzik+tarih);
        double sonuc=toplam/6;
        System.out.println("ortalama:"+ sonuc);
        var s = sonuc > 60 ? "Geçti" : "Kaldı";
        System.out.println(s);

    }
}
