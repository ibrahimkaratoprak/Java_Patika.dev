package PatikaJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class kdvtutari {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Tutarı Girin:");
        double tutar=input.nextDouble();

        System.out.println("KDV'siz tutar:"+ tutar+" tl");
        System.out.println("KDV'li tutar:"+ tutar*118/100 +" tl");
        System.out.println("KDV tutarı:"+ tutar*18/100+ " tl");
    }
}
