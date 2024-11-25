package day12_stringManipulations;

import java.util.Scanner;

public class C04_replaceAll {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine();


        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyisim = scanner.nextLine();


        System.out.println("Lutfen kart numaranizi giriniz: ");
        String kartNo = scanner.nextLine();


        System.out.println(
                "isminiz :" + isim.substring(0,1).toUpperCase()
                + isim.substring(1).replaceAll("\\S", "*")
                + " " // isim ile soyisim arasindaki bosluq
                + soyisim.substring(0,1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\S" ,"*")
                + "\nKart no : " + kartNo.replaceAll("\\d" ,"*")


        );

    }
}
