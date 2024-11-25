package day09_ternary_switch;

import java.util.Scanner;

public class C04_SwitchStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmasa həftənin bir gününün adını yazın!");
        String gunIsmi = scanner.nextLine().toLowerCase();

        switch (gunIsmi) {

            case "bazar ertəsi":
            case "çərşənbə axşamı":
            case "çərşənbə":
            case "cümə axşamı":
            case "cümə":
                System.out.println("İş günü!");
                break;
            case "şənbə":
            case "bazar":
                System.out.println("Tətil günü!");
                break;
            default:
                System.out.println("Gün adı düzgüz deyil!");
        }
    }
}

