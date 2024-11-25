package day08_ifElseStatements_NestedifElse;

import java.util.Scanner;

public class C02_NestedIfElse_Emeklilik {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz. E: erkek, K: kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Yasinizi girin: ");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'K') {

            if (yas < 15 || yas > 80) {
                System.out.println("Bu yas degerleri icin emeklilik yasi hesablanamaz!");
            } else if (yas >= 60) {
                System.out.println("Kadin 60 yasindan itibaren emekli ola bilir!");
            } else {
                System.out.println("Emeklilik yasi 60, daha " + (60-yas) + " yil calismali!" );
            }


        } else if (cinsiyet == 'E') {

            if (yas < 15 || yas > 80) {
                System.out.println("Bu yas degerleri icin emeklilik yasi hesablanamaz!");
            } else if (yas >= 60) {
                System.out.println("Erkek 65 yasindan itibaren emekli ola bilir!");
            } else {
                System.out.println("Emeklilik yasi 65, daha " + (65-yas) + " yil calismali!" );
            }
        } else {
            System.out.println("Cinsiyet E ve ya K olarak girilmelidir!");
        }
    }
}
