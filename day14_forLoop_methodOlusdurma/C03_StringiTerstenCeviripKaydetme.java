package day14_forLoop_methodOlusdurma;

import javax.naming.NamingEnumeration;
import java.util.Scanner;

public class C03_StringiTerstenCeviripKaydetme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scanner.nextLine();
        String tersMetin = "";

        for (int i = metin.length()-1; i >= 0; i--) {

            tersMetin += metin.charAt(i);
        }

        System.out.println("Girilen metinin tersden yazilisi : " + tersMetin);

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin Palindrome"); // tersi ve duzu ayni
        }else {
            System.out.println("Girilen metin Palindrome DEGIL");
        }
    }
}
