package day14_forLoop_methodOlusdurma;

import java.util.Scanner;

public class C01_AsalSayiMi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tap sayi giriniz: ");
        int sayi = scanner.nextInt();

        boolean asalMi = true;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0){
                System.out.println("Girilen sayi asal degil!");
                asalMi = false;
                break;
            }
        }

        if (asalMi){ //asalMi == true
            System.out.println("Girilen sayi asal!");
        }
    }
}
