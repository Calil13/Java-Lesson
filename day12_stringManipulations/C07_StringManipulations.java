package day12_stringManipulations;

import java.util.Scanner;

public class C07_StringManipulations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Isminizi girin: ");
        String isim = scanner.nextLine();

        System.out.println("Soyisminizi girin: ");
        String soyIsim = scanner.nextLine();


        if (isim.length() > soyIsim.length()) {

            System.out.println(

                    isim.substring(0,1).toUpperCase()
                    +isim.substring(1).toLowerCase()
                    + " "
                    + soyIsim.substring(0,1).toUpperCase()
                    + soyIsim.substring(1).toLowerCase()
            );

        }

        if (soyIsim.length() > isim.length()) {

            System.out.println(

                    isim.substring(0,1).toUpperCase()
                    + isim.substring(1).toLowerCase()
                    + " "
                    + soyIsim.toUpperCase()
            );
        }
    }
}
