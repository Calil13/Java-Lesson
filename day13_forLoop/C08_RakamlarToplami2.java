package day13_forLoop;

import java.util.Scanner;

public class C08_RakamlarToplami2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int basamakSayisi = (girilenSayi+"").length();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int dummyNumber = girilenSayi;

        for (int i = 1; i <= basamakSayisi; i++) {

            birlerBasamagi = dummyNumber % 10;
            rakamlarToplami += birlerBasamagi;
            dummyNumber /= 10;

        }

        System.out.println("Giridiginiz " + girilenSayi + " sayisi icin rakamlar topmali " + rakamlarToplami);
    }
}
