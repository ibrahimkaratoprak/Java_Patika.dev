package PatikaJava;

import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adınız:");
        userName=input.nextLine();
        System.out.print("Şifreniz:");
        password=input.nextLine();
        if (userName.equals("patika.dev") && password.equals("java123")){
            System.out.println("Giriş Yaptınız.");
        }else {
            System.out.println("kullanıcı bilgileriniz yanlış!");
        }

    }
}
