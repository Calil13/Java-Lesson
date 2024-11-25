package day14_forLoop_methodOlusdurma;

import java.util.Scanner;

public class C02_StringiTerstenYazdirma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        for (int i = metin.length()-1; i >= 0; i--) {

            System.out.print(metin.charAt(i));

        }
    }
}
