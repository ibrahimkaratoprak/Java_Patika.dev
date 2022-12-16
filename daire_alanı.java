package PatikaJava;

import java.util.Scanner;

public class daire_alanı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("dairenin yarıçapını giriniz(br):");
        double r= input.nextDouble();
        System.out.print("dairenin merkez ölçüsünü giriniz(br):");
        double a= input.nextDouble();
        double alan = 3.14*r*r*a/360.0 ;
        System.out.println("dairenin alanı:" + alan+" br^2");
    }
}
