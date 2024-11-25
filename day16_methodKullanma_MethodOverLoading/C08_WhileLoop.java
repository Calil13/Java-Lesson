package day16_methodKullanma_MethodOverLoading;

import java.util.Scanner;

public class C08_WhileLoop {

    public static void main(String[] args) {

        // kullaniciya isdedigi kadar pozitif sayi girmesini soyleyin
        // girilen sayi pozitif ise sayini toplama ekleyin
        // girilen sayi negatif ise uyari verin ve sayiyi isleme almayin
        // girilen sayi 0 oldugunda islemi bitirin
        // ve kac tane pozitif sayi girildigini
        // ve toplamlarinin kac oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);

        int sayi = 42;
        int toplam = 0;
        int sayac = 0;

        while (sayi != 0){

            // kullanicidan sayi isdeyelim
            System.out.println("Lutfen pozitif bir tamsayi girin, bitirmek icin 0'a basin!");
            sayi = scanner.nextInt();

            if(sayi > 0){

                toplam += sayi;
                sayac++;
            } else if (sayi < 0) {
                System.out.println("girdiginiz sayi pozitif degil!");
            }
        }
        System.out.println("Girdiginiz " + sayac + " adet pozitif tamsayinin toplami : " + toplam);

    }
}
