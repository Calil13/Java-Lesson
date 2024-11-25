package day11_stringManipulations;

import java.util.Scanner;

public class C05_indexOf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metini giriniz!");
        String str = scanner.nextLine();

        int birinciKulanimIndexi = str.indexOf('a');

        int ikinciKulanimIndexi = str.indexOf('a', birinciKulanimIndexi+1);

        int ucuncuKulanimIndexi = str.indexOf('a', ikinciKulanimIndexi+1);

        System.out.println("2.a'nin indexi : " + ikinciKulanimIndexi);
        System.out.println("3.a'nin indexi : " + ucuncuKulanimIndexi);
    }
}
