package day13_forLoop;

import java.util.Scanner;

public class C06_FaktoryerYazdirma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoryer hesaplamak icin pozitif tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        int faktoryerDegeri = 1;

        System.out.print(sayi + "! = ");

        for (int i = sayi; i >= 1; i--) {

            faktoryerDegeri *= i;
            if (i != 1) {System.out.print(i + " * ");}

        }
        System.out.println("1 =" + faktoryerDegeri);
    }
}
