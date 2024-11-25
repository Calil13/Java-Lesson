package day12_stringManipulations;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class C09_SifreKontrolu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi girin : ");
        String sifre = scanner.nextLine();

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
            System.out.println("Sifre basariyla kayd edildi!");
        }
    }
}
