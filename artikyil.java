package PatikaJava;
import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Lütfen yıl girin: ");
            int year = scan.nextInt();

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " bir artık yıldır.");
                    } else {
                        System.out.println(year + " bir artık yıl değildir.");
                    }
                } else {
                    System.out.println(year + " bir artık yıldır.");
                }
            } else {
                System.out.println(year + " bir artık yıl değildir.");
            }
        }
    }


