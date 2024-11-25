package day09_ternary_switch;

import java.util.Scanner;

public class C03_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmasa həftənin bir gününü yazın!");
        int gunNo = scanner.nextInt();

        switch (gunNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Həftəiçi!");
                break;
            case 6:
            case 7:
                System.out.println("Həftəsonu!");
                break;
            default:
                System.out.println("Gün nömrəsi 1-7 arasında olmalıdır!");
        }
    }
}


