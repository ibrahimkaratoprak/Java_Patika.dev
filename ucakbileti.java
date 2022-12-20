package PatikaJava;

import java.util.Scanner;
/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki
        koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
        olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

public class ucakbileti {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int km,yas,yolculuktipi;
        double kmbirim=10,tutar = 0;
        System.out.print("Km:");
        km=input.nextInt();
        System.out.print("Yaşınız:");
        yas=input.nextInt();
        System.out.println("Yolculuk tipi \n1.Tek yön \n2.Gidiş-Dönüş");
        yolculuktipi=input.nextInt();
        if (yas<0 || km<0 ){
            System.out.println("Hatalı Veri Girdiniz !");
        }else {
            switch (yolculuktipi){
                case 1:
                    tutar=(km*kmbirim);
                    break;
                case 2:
                    tutar=2*km*kmbirim;
                    break;}
        //toplam tutar hesaplandı.sırada indirimleri hesaplayıp güncel tutarı belirleyeceğiz.

            if (yas<12 && yas>0){
                tutar=tutar*0.5;}
            else if (yas>=12 && yas<=24) {
                tutar=tutar*0.9;
        }   else if (yas>65) {
                tutar=tutar*0.7;
        }   if (yolculuktipi==2){
                tutar=tutar*0.8;}
            System.out.println("Toplam tutar = "+ tutar);}


    }
}
