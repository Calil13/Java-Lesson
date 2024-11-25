package day15_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C07_PalindromeMu {

    public static void main(String[] args) {

        // kullanicidan bir metin alip
        // polindrome olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kontrul icin bir metin girin: ");
        String metin = scanner.nextLine();

        String tersMetin = C06_MetiniTersineCevir.metiniTersineCevir(metin);

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girdiginiz metin palindrome");
        }else {
            System.out.println("Girdiginz metin palindrome degil");
        }
    }
}
