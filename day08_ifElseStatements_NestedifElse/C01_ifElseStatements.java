package day08_ifElseStatements_NestedifElse;

import java.util.Scanner;

public class C01_ifElseStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitiv bir tam sayi girin: ");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi < 0) {
            System.out.println("Sayi negativ!");
        } else if (girilenSayi < 10) {
            System.out.println("Sayi rakam!");
        } else if (girilenSayi < 100) {
            System.out.println("Iki tam basamakli sayi!");
        } else if (girilenSayi < 1000) {
            System.out.println("Uc basamakli sayi!");
        }else {
            System.out.println("Cok buyuk sayi!");
        }
    }
}
