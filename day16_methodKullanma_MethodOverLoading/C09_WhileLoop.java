package day16_methodKullanma_MethodOverLoading;

import java.util.Scanner;

public class C09_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan isdedigin kadar isim girmesini isdeyin
        // kullanici islemi bitirmek icin Q'ya basmalidir (q ve ya Q)
        // girilen her ismin uzunlugunu kontrul edin ve
        // islem bitirildiginde en cok harfe sahip ola (en uzun) ismi yazdirin
        // esit sayda harfe sahip isimlerden herhangi biri olabilir

        enUzunKelimeBulmaVeYazdirma();
        System.out.println(enUzunKelimeyiBulVeDondur());

    }

    public static void enUzunKelimeBulmaVeYazdirma(){

        Scanner scanner = new Scanner(System.in);
        String enUzunKelime = "";
        String girilenKelime = "";

        while ( !girilenKelime.equalsIgnoreCase("q")){

            System.out.println("Lutfen bir kelime giriniz: \nIslemi bitirmek isdersiniz q ya basiniz!");
            girilenKelime = scanner.nextLine();

            if (girilenKelime.length() > enUzunKelime.length()){

                enUzunKelime = girilenKelime;
            }
        }
        System.out.println("Girilen en uzun kelime: " + enUzunKelime);

    }

    public static String enUzunKelimeyiBulVeDondur(){

        Scanner scanner = new Scanner(System.in);
        String enUzunKelime = "";
        String girilenKelime = "";

        while ( !girilenKelime.equalsIgnoreCase("q")){

            System.out.println("Lutfen bir kelime giriniz: \nIslemi bitirmek isdersiniz q ya basiniz!");
            girilenKelime = scanner.nextLine();

            if (girilenKelime.length() > enUzunKelime.length()){

                enUzunKelime = girilenKelime;
            }
        }
        return enUzunKelime;
    }
}
