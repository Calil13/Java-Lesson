package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_ArrayinTumElementleriniGozdenGecirme {

    public static void main(String[] args) {

        int[] arr = {3,4,6,7,8,9,0};
        System.out.println(Arrays.toString(arr));

        int elementlerinToplami = 0;

        for (int i = 0; i < arr.length; i++) {

            elementlerinToplami += arr[i];

        }
        System.out.println(elementlerinToplami);

        int ciftSayiAdedi = 0;
        int tektSayiAdedi = 0;

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] % 2 == 0){
                ciftSayiAdedi++;
            }else {
                tektSayiAdedi++;
            }
        }
        System.out.println("Cift: "+ciftSayiAdedi + " , Tek: " + tektSayiAdedi);


        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "  ");

        }
        System.out.println("");

        
        //Sual:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayi girin: ");
        int girilenSayi = scanner.nextInt();
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == girilenSayi) sayac++;

        }

        if (sayac == 0){
            System.out.println("girilen sayi arrayda yok");
        }else {
            System.out.println("girilen " + girilenSayi + " sayisi arrayde " + sayac + " adet var");
        }
        
    }
}
