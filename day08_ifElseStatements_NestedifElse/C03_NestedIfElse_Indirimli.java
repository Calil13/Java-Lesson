package day08_ifElseStatements_NestedifElse;

import java.util.Scanner;

public class C03_NestedIfElse_Indirimli {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Urun adedi giriniz: ");
        int urunAdedi = scanner.nextInt();

        System.out.println("Urunun indirimisiz fiyatini girin: ");
        double urunFiyati = scanner.nextDouble();

        double indirimsizToplamFiyat = urunFiyati*urunAdedi;

        System.out.println("Musteri kartiniz varmi? E: evet, H: hayir");
        char kartVarmi = scanner.next().toUpperCase().charAt(0);

        if (kartVarmi == 'E') {
            if (urunAdedi>10) {
                System.out.println("20% indirimli toplam fiyat : " + indirimsizToplamFiyat * 80 / 100);
            } else {
                System.out.println("15% indirimli toplam fiyat : " + indirimsizToplamFiyat * 85/100);
            }

        } else if (kartVarmi == 'H') {
            if (urunAdedi>10){
                System.out.println("15% indirimli toplam fiyat : " + indirimsizToplamFiyat * 85/100);

            } else {
                System.out.println("10% indirimli toplam fiyat : " + indirimsizToplamFiyat * 90/100);

            }

        } else {


        }
    }
}
