package day06_matamatikselKarsilasdiermalar_ifStatements;

import java.util.Scanner;

public class C03_BagimsizifCumleleri {

    public static void main(String[] args) {

        //kulanicidan 2 tam sayi alin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi girinz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        //sayi1 > sayi2 ise "ilk sayi daha boyuk"
        if (sayi1 > sayi2){
            System.out.println("Ilk sayi daha buyuk");
        }

        //sayi1 cift sayi ise "ilk sayi cift bir sayidir"
        if (sayi1 % 2 == 0){
            System.out.println("ilk sayi cift bir sayidir");
        }

        //sayi2 100den buyukse "ikinci sayi cok buyukdur"
        if (sayi2 > 100){
            System.out.println("ikinci sayi cok buyukdur");
        }

        //sayi2 3'e bolunebilirse "ikinci sayi 3'un tam kati" yazdirin
        if (sayi2 % 3 == 0){
            System.out.println("ikinci sayi 3'un tam kati");
        }



    }
}
