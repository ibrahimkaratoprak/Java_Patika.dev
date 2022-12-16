package PatikaJava;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("Dik üçgenin kısa kenarını giriniz:");
        a= input.nextDouble();
        System.out.print("dik üçgenin diğer kısa kenarını giriniz:");
        b= input.nextDouble();
        c=(a*a+b*b);
        System.out.print("Hipotenüsün Uzunluğu:" +Math.pow(c,0.5));
    }
}
