package day12_stringManipulations;

import java.util.Scanner;

public class C01_replaceFirst {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.println(metin.replaceFirst("\\d", "X"));


        System.out.println("Lutfen kart numaranizi girin: ");
        String kartNo = scanner.nextLine();

        System.out.println(kartNo.replaceAll("\\d", "*"));


    }
}
