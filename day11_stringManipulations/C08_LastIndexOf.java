package day11_stringManipulations;

import java.util.Scanner;

public class C08_LastIndexOf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak metini girin : ");
        String metin = scanner.nextLine();

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);

        if ( !cumle.contains(metin )) {
            System.out.println("cumle aranan metini icermiyor");
        } else if (ilkIndex == sonIndex) {
            System.out.println("cumle aranan metini sadece 1 defa iceriyor");
        }else {
            System.out.println("cumle aranan metini 1 den fazla iceriyor");
        }
    }
}
