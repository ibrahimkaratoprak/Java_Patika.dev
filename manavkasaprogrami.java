package PatikaJava;

import java.util.Scanner;

public class manavkasaprogrami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut,elma,domates,muz,patlican,tutar;
        System.out.print("Armut miktarı(kg): ");
        armut= input.nextDouble();
        System.out.print("elma miktarı(kg): ");
        elma = input.nextDouble();
        System.out.print("domates miktarı(kg): ");
        domates= input.nextDouble();
        System.out.print("muz miktarı(kg): ");
        muz= input.nextDouble();
        System.out.print("Patlıcan miktarı(kg): ");
        patlican= input.nextDouble();
        tutar=(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.0) ;
        System.out.println("Toplam tutar:" + tutar + " tl");


    }
}
