package day14_forLoop_methodOlusdurma;

import java.util.Scanner;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        /*
            Kullanicidan satir ve sutun sayisi alip asagidaki sekilde cizdirin
            ornek: satir = 4 , sutun = 5 oldugunda
            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8
            5 6 7 8 9
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scanner.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {

                System.out.print( i + j + " ");
            }
            System.out.println("");
        }
    }
}
