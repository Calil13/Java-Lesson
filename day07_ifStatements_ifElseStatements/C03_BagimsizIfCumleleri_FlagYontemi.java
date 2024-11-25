package day07_ifStatements_ifElseStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri_FlagYontemi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int flag = 10;

        if (sayi1<sayi2){
            System.out.println("1-ci sayi kucuk!");
            flag = 11;
        }

        if (sayi1>0){
            System.out.println("1-ci sayi pozitiv!");
            flag = 11;
        }

        if (sayi2>50){
            System.out.println("2-ci sayi 50 den buyuk!");
            flag = 11;
        }

        if (sayi2 % 5 == 0){
            System.out.println("2-ci sayi 5'in tam kati!");
            flag = 11;
        }

        if (flag == 10){
            System.out.println("Yanlis sayilar");
        }
    }
}
