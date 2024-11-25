package day14_forLoop_methodOlusdurma;

import java.util.Scanner;

public class C07_NestedLoop {

    public static void main(String[] args) {

        /*
            kullanicidan satir sayisini alip asagidaki sekilde cizdirin
            ornek: satir = 5

                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini girin");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
