package PatikaJava;

import java.util.Scanner;

public class Vki {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double vucutkitle,boy,agirlik ;
        System.out.print("Boy(m):");
        boy= input.nextDouble();
        System.out.print("Ağırlık(kg):");
        agirlik= input.nextDouble();
        vucutkitle=agirlik/((boy*boy)) ;
        System.out.println("Vücut Kitle Endeksiniz:"+ vucutkitle);


    }
}
