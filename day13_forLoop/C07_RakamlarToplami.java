package day13_forLoop;

import java.util.Scanner;

public class C07_RakamlarToplami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int basamakSayisi = (girilenSayi+"").length();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <= basamakSayisi; i++) {

            birlerBasamagi = girilenSayi % 10;
            rakamlarToplami += birlerBasamagi;
            girilenSayi /= 10;

        }

        System.out.println("Rakamlar toplami: " + rakamlarToplami);
    }
}
