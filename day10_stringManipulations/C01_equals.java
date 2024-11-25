package day10_stringManipulations;

import java.util.Scanner;

public class C01_equals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi girin: ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals("Calil13")){
            System.out.println("Sisteme giris yapa bilirsiniz!");

        }else System.out.println("Yanlis sifre!");
    }
}
