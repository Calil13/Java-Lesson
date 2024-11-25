package day11_stringManipulations;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class C07_indexOf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak metini girin : ");
        String metin = scanner.nextLine();

        int birinciIndex = cumle.indexOf(metin);
        int ikinciIndex = cumle.indexOf(metin, birinciIndex+1);

        if (birinciIndex == -1){
            System.out.println("Cumle aranan metini icermiyor!");
        }else if (ikinciIndex == -1) {
            System.out.println("cumle aranan metini sadece 1 adet iceriyor");
        }else {
            System.out.println("cumle aranan metini 1'den fazla iceriyor");
        }
    }
}
