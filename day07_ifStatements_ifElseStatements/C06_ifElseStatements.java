package day07_ifStatements_ifElseStatements;

import java.util.Scanner;

public class C06_ifElseStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac urun aldinizi girin: ");
        int adet = scanner.nextInt();

        System.out.println("Bir urunun fiyatini girin: ");
        double urunFiyati = scanner.nextDouble();

        double toplamIndirimsizFiyat = adet * urunFiyati;

        if (adet <=0 || urunFiyati <= 0 ){
            System.out.println("Negativ deger girdiniz");

        }else if (adet >= 100){
            System.out.println("%25 indirimli toplam fiyat: " + toplamIndirimsizFiyat * 75 / 100);
       
        }else if (adet >= 50){
            System.out.println("%20 indirimli toplam fiyat: " + toplamIndirimsizFiyat * 80 / 100);

        } else if (adet >= 10) {
            System.out.println("%10 indirimli toplam fiyat:" + toplamIndirimsizFiyat * 90 / 100);

        }else {
            System.out.println("Indirim yapamiyoruz. Toplam fiyat: " + toplamIndirimsizFiyat);
        }

    }
}
