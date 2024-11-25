package day02_varibale_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // 1) kulanicidan ismini iste

        // kulanicidan ismini isdemek icin Scanner classini kulaniriz
        // bilgiyi kullanicidan alib, kod dunyasinda kaydetmek icin 3 adim atmamiz gerekdir
        //1.adim : Scanner classinda bir obje olsuduralim

        Scanner scanner = new Scanner(System.in);

        //2.adim : kullaniciya ne isdediginizi yazdirin

        System.out.println("Please enter your name: ");

        //3.adim : kullanicidan isdediginiz bilgiye uygun bir variable olusturup
        //         scanner objesi ile girilen bilgiye uygun next method'u kullanarak
        //         kullanicinin konsuldan girdigi bilgiyi alib, kod dunyasinda kaydederiz


        String girilenIsim = scanner.nextLine();

        // 2) ismini buyuk harfe cevirip, yeni haliyle kayd edin

        girilenIsim = girilenIsim.toUpperCase();


        // 3) ve islem sonucunda "Girilen isim : CALIL AHAMDOV" seklinde konsolda yazdirin

        System.out.println("Girilen isim : " + girilenIsim);




    }
}
