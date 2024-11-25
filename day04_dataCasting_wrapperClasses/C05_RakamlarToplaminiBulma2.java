package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_RakamlarToplaminiBulma2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("3 rakamli tam bir sayi girin: ");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int oAnkiSayininBirlerBasami = 0;

        //sayi = 323,  rakamlartoplami = 0

        oAnkiSayininBirlerBasami = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + oAnkiSayininBirlerBasami;

        int sayininYeniHali = girilenSayi / 10;

        //sayininYeniHali = 32, rakamlarToplami = 3

        oAnkiSayininBirlerBasami = sayininYeniHali % 10;

        rakamlarToplami = rakamlarToplami + oAnkiSayininBirlerBasami;

        sayininYeniHali = sayininYeniHali / 10;

        rakamlarToplami = rakamlarToplami + sayininYeniHali;

        System.out.println("Girdiginiz " + girilenSayi + " in rakamlar toplami : " + rakamlarToplami);
    }
}
