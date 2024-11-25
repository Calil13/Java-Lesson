package day12_stringManipulations;

import java.util.Scanner;

public class C06_StringManipulations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lufen bir metin giriniz : ");
        String metin = scanner.nextLine();

        int metinUzunlugu = metin.length();

        if (metinUzunlugu % 2 == 0) {
            System.out.println(
                    metin.substring(0,metinUzunlugu/2)
                    + ":)"
                    +metin.substring(metinUzunlugu/2)
            );


        }else {
            System.out.println(

                    metin.substring(0,metinUzunlugu/2)
                    + ":("
                    + metin.substring(1+metinUzunlugu/2)
            );

        }
    }
}
