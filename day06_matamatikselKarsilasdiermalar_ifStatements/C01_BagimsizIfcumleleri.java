package day06_matamatikselKarsilasdiermalar_ifStatements;

import java.util.Scanner;

public class C01_BagimsizIfcumleleri {

    public static void main(String[] args) {

        //kulanicidan notunu alin
        //notu 50 veya daha buyukse "sinifi gectin" yazin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen nontunuzu girin: ");
        double not = scanner.nextDouble();

        if (not >= 50) {
            System.out.println("Sinifi gectiniz!");
        }
    }
}
