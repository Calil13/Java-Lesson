package day10_stringManipulations;

import java.util.Scanner;

public class C02_equalsIgnoreCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz : ");
        String girilenGunIsmi = scanner.nextLine();

        if (girilenGunIsmi.equalsIgnoreCase("cumartesi")){
            System.out.println("Ohhh bu gun yan gel yat");
        }
    }
}
