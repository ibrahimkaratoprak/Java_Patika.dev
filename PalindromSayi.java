package PatikaJava;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int num = input.nextInt();
        boolean result = isPalindrome(num);
        System.out.println(result);
    }

    static boolean isPalindrome(int number) {
        int temp = number, lastNumber = 0, reverseNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }
}
