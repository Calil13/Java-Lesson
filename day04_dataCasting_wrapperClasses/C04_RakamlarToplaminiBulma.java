package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Killanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // mes: input = 245 ise output = 11


        Scanner scanner = new Scanner(System.in);

        System.out.println("3 basamakli bir sayi girin : ");
        int girilensayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int oAnkiSayininBirlerBasamgi = 0;

        // 1.adim sayi : 245, rakamlartoplami : 0

        oAnkiSayininBirlerBasamgi = girilensayi % 10;

        rakamlarToplami = rakamlarToplami + oAnkiSayininBirlerBasamgi;

        int sayininYeniHali = girilensayi / 10;

        // 2.adim sayininYeniHali : 24 , rakamalarToplami : 5

        oAnkiSayininBirlerBasamgi = sayininYeniHali % 10;

        rakamlarToplami = rakamlarToplami + oAnkiSayininBirlerBasamgi;

        sayininYeniHali = sayininYeniHali / 10;

        rakamlarToplami = rakamlarToplami +sayininYeniHali;


        System.out.println("Girdiginiz " + girilensayi + " nin rakamlar toplami : " + rakamlarToplami);
    }

}
