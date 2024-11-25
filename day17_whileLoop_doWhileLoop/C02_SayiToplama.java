package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_SayiToplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        while ( toplam < 500){

            System.out.println("Lutfen toplamak uzere pozitif bir tam sayi giriniz! ");
            sayi = scanner.nextInt();

            if (sayi > 0){

                toplam += sayi;
                sayac++;
            }else {
                System.out.println("Sayi pozitif olmali! ");
            }
        }

        System.out.println("Girdiginiz " + sayac + "adet pozitif tamsayinin toplami : " + toplam);
    }
}
