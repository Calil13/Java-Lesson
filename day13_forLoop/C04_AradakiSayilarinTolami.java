package day13_forLoop;

import java.util.Scanner;

public class C04_AradakiSayilarinTolami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic degeri olarak pozitif tamsayi giriniz: ");
        int baslangic = scanner.nextInt();

        System.out.println("Bitis degeri olarak pozitif tamsati giriniz: ");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis < baslangic || baslangic < 0 || bitis < 0) {
            System.out.println("baslangic veya bitis degerlieri uygu degil");
        }else {

            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }

            System.out.println("Girilen degerler arasindaki tamsayilarin toplami: " + toplam);
        }
    }
}
