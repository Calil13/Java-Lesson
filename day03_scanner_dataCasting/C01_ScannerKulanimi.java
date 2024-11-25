package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_ScannerKulanimi {

    public static void main(String[] args) {

        //Soru: Kullanicidan bir double, bir de int sayi alip
        //      bunlarin toplamini ve carpimini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz: ");

        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Lutfen bir Tam sayi giriniz: ");

        int tamSayi = scanner.nextInt();

        System.out.println("Toplam: " + (ondalikliSayi + tamSayi));

        System.out.println("Carpim: " + ondalikliSayi * tamSayi);



    }
}
