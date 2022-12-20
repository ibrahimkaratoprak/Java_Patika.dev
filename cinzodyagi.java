package PatikaJava;

import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı Giriniz:");
        int dogumyili=input.nextInt();
        String hangihayvan = null;
        int dogumyilikalan=(dogumyili%12);
        switch (dogumyilikalan){
            case 0:
                hangihayvan="maymun";
                break;
            case  1:
                hangihayvan="horoz";
                break;
            case 2:
                hangihayvan="köpek";
                break;
            case 3:
                hangihayvan="domuz";
                break;
            case 4:
                hangihayvan="fare";
                break;
            case 5:
                hangihayvan="öküz";
                break;
            case 6:
                hangihayvan="kaplan";
                break;
            case 7:
                hangihayvan="tavşan";
                break;
            case 8:
                hangihayvan="ejderha";
                break;
            case 9:
                hangihayvan="yılan";
                break;
            case 10:
                hangihayvan="at";
                break;
            case 11:
                hangihayvan="koyun";
                break;

        }
        System.out.println(hangihayvan);
    }
}
   /* Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun

        Senaryo*/