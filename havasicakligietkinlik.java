package PatikaJava;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
/*      Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

public class havasicakligietkinlik {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int heat;
        System.out.print("Hava sıcaklığını giriniz:");
        heat=input.nextInt();
        if (heat<5){
            System.out.println("Kayağa gidebilirsiniz.");
        } else if (heat<15 ) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat>=15 && heat<25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
