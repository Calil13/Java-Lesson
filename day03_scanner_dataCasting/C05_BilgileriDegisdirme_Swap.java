package day03_scanner_dataCasting;

import java.util.Scanner;

public class C05_BilgileriDegisdirme_Swap {

    public static void main(String[] args) {

        // Soru: Kullanicidan iki sayi alip ikisininde deyerlerini degisdir(Swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1-ci tam sayiyi giriniz: ");

        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2-ci tam sayiyi giriniz: ");

        int sayi2 = scanner.nextInt();

        int bosKova = 0;

        bosKova = sayi2;

        sayi2 = sayi1;

        sayi1 = bosKova;


        System.out.println("Sayi1 in yeni degeri : " + sayi1);
        System.out.println("Sayi2 in yeni degeri : " + sayi2);


    }

}
