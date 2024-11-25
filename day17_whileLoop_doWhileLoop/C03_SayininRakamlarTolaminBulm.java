package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_SayininRakamlarTolaminBulm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakmalar toplamini bulmak icin pozitif bir tamsayi giriniz : ");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int birlerBasamagi = 0;
        int dummyNumber = girilenSayi;

        while ( dummyNumber != 0){

            birlerBasamagi = dummyNumber % 10;
            rakamlarToplami += birlerBasamagi;
            dummyNumber /= 10;
        }

        System.out.println("Girdiginiz " +girilenSayi +" sayinin rakamlar toplami :" + rakamlarToplami);
    }
}
