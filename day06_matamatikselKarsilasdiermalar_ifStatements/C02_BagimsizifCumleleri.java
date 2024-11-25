package day06_matamatikselKarsilasdiermalar_ifStatements;

import java.util.Scanner;

public class C02_BagimsizifCumleleri {

    public static void main(String[] args) {

        //kulanicidan bir ucgenin kenar uzunluklarini alin
        //kenar uzunluklari birbirine esit ise "Eskenar ucgen" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz: ");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3){

            System.out.println("Eskenar ucgen!");
        }
    }
}
