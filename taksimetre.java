package PatikaJava;
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double km,tutar=10.0;
        Scanner input=new Scanner(System.in);
        System.out.print("Km'yi giriniz:");
        km= input.nextDouble();
        tutar += km*2.20;
        tutar=(tutar<20) ? 20: tutar;
        System.out.println(tutar);

    }
}
