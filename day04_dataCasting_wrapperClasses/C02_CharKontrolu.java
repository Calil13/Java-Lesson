package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C02_CharKontrolu {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isdeyin
        // girilen karakter sayi ise true, degilse false yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir karakter giriniz: ");

        char girilenKarakter = scanner.next().charAt(0);   //Kullanicinin girdigi String'in ilk karakterini aliyoruz

        System.out.println(Character.isDigit(girilenKarakter));



    }

}
