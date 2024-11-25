package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_DikdortkeninAlani {

    public static void main(String[] args) {

        // Sour: Kullanicidan bir dikdortkenin 2 kenar uzunlugunu alip,
        //       diktortkenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortkenin kenar uzunluklarini giriniz: ");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortkenin alani: " + (kenar1 * kenar2));


    }

}
