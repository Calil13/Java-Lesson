package day03_scanner_dataCasting;

import java.util.Scanner;

public class C04_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        // Soru: Kullanicidan ismini, soyismini ve yasini alip
        //       asagidaki formatada yazdirin.
        //       Girilen bilgiler : C Ahmadov, 18

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");

        String girilenIsiim = scanner.nextLine();

        System.out.println("Lutfen Soyisminizi giriniz: ");

        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz: ");

        int girilenYas = scanner.nextInt();

        System.out.println(

                "Girilen Bilgiler: " + girilenIsiim.charAt(0) + " " + girilenSoyisim + ", " + girilenYas

        );

    }

}
