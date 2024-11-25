package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_KullaniciBilgileriniYazdirima {

    public static void main(String[] args) {

        /* Soru:
        *  Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatda yazdirin.
        *  Isminiz : Calil
        *  Soyisminiz : Ahmadov
        *  Yasiniz : 18
        *  Kaydiniz basariyla tamamlanmisdir.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");

        String girilenIsim = scanner.nextLine();

        System.out.println("Lutfen Soyisiminizi giriniz: ");

        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz: ");

        int girilenYas = scanner.nextInt();

        System.out.println(
                "Isminiz : " + girilenIsim +
                "\nSoyisminiz : " + girilenSoyisim +
                "\nYasiniz : " + girilenYas +
                "\nKaydiniz basariyla tamamlanmisdir."
        );


    }

}
