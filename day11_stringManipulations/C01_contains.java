package day11_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C01_contains {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin girin!");
        String metin = scanner.nextLine().toLowerCase();


        if (metin.contains("ev") && metin.contains("is")){
            System.out.println("Hem ev hemde is sozu var");
        } else if (metin.contains("ev")) {
            System.out.println("Ev sozu var");
        } else if (metin.contains("is")) {
            System.out.println("Ev sozu var");
        }else {
            System.out.println("Hic biri yok");
        }
    }
}
