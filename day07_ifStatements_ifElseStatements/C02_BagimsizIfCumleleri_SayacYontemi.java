package day07_ifStatements_ifElseStatements;

import java.util.Scanner;

public class C02_BagimsizIfCumleleri_SayacYontemi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int sayac = 0;

        if (sayi1<sayi2){
            System.out.println("1-ci sayi kucuk!");
            sayac++;
        }

        if (sayi1>0){
            System.out.println("1-ci sayi pozitiv!");
            sayac++;
        }

        if (sayi2>50){
            System.out.println("2-ci sayi 50 den buyuk!");
            sayac++;
        }

        if (sayi2 % 5 == 0){
            System.out.println("2-ci sayi 5'in tam kati!");
            sayac++;
        }

        if (sayac == 0) System.out.println("Yanlis cevap!");

        if (sayac == 4) System.out.println("Secdin sayi cok guzel!");
    }
}
