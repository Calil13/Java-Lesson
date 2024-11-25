package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_BasariliSifreAlma {

    public static void main(String[] args) {


        // day12 C09 de yapdigimiz sifre kontrolu sorusunu
        // sifre basarisiz oldugunda hatalari yazdirip false donen
        // sifre basarrili oldugunda ise true donen bir method haline getirin

        // olusdurdugunuz methodu kullanrarak
        // kullanici hatasiz bir sifre girinceye kadar tekrar tekrar sifre isteyin
        // kabul edilebilir bir sifre giridiginde "Sifreniz basarili olarak kaydedildi" yadirin

        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean sifreUygunmu = false;

        while (sifreUygunmu == false){

            System.out.println("Lutfen sifrenizi giriniz : ");
            sifre = scanner.nextLine();

            sifreUygunmu = sifreKontrolEt(sifre);
        }
        System.out.println("Sifreniz basariyla kayd edildi");

    }

    public static boolean sifreKontrolEt(String sifre){

        int hataSayaci = 0;

        // -ilk harf kucuk harf olmali
        if ( !Character.isLowerCase(sifre.charAt(0))){

            System.out.println("Ilk karakter kucuk harf olmali!");
            hataSayaci++;
        }
        // -son karakter rakam olmali
        if ( ! Character.isDigit( sifre.charAt(sifre.length()-1))){

            System.out.println("Son karakter rakam olmali!");
            hataSayaci++;
        }

        // - sifre bosluk icermemeli
        if ( sifre.contains(" ")){

            System.out.println("Sifre bosluk icermemeli");
            hataSayaci++;
        }

        // uzunluk en az 10 karakter olmali
        if (sifre.length() < 10){

            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            hataSayaci++;
        }

        if (hataSayaci == 0){
            return true;
        }else {
            return false;
        }
    }
}

