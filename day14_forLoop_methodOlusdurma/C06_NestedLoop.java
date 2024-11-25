package day14_forLoop_methodOlusdurma;

import java.util.Scanner;

public class C06_NestedLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {

                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
