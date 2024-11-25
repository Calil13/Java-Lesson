package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C03_Modulus {

    public static void main(String[] args) {

        // Kullanicodan bir tam sayi isdeyin ver sayinin birler basamani (MƏS:təkliy, onluq, yüzlüy) yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi girin: ");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayinin birler basami: " + girilenSayi % 10);

        // Girilen sayinin cift olub olmadigini kontrul etmek icin
        // girilenSayi % 2 = 0 ise ciftdir, 0-a esit degilse tekdir

        //girilenSayinin 5 e bolunub bolunmedini kontrul etmek icin
        // girilenSayi % 5 = 0 ise sayi 5 e tam bolunur, sifira esit degilse 5 e bolunmuyor


    }

}
