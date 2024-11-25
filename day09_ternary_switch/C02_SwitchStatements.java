package day09_ternary_switch;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmasa həftənin bir gününü yazın!");
        int gunNo = scanner.nextInt();

        switch (gunNo) {

            case 1:
                System.out.println("Bazar ertəsi!");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı!");
                break;
            case 3:
                System.out.println("Çərşənbə!");
                break;
            case 4:
                System.out.println("Cümə axşamı!");
                break;
            case 5:
                System.out.println("Cümə!");
                break;
            case 6:
                System.out.println("Şənbə!");
                break;
            case 7:
                System.out.println("Bazar!");
                break;
            default:
                System.out.println("Gün nömrəsi 1-7 arasında olmalıdır!");
        }
    }
}
