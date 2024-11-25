package day11_stringManipulations;

import java.util.Scanner;

public class C04_EmailKontrol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen email adresini giriniz!");
        String email = scanner.nextLine();

        if ( !email.contains("@")){
            System.out.println("Gecersiz mail!");
        }
        if ( !email.contains("@gmail.com")) {
            System.out.println("mail gmail olmali!");
        }
        if ( !email.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var!");
        }
    }
}
