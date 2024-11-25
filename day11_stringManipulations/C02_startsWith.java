package day11_stringManipulations;

import java.util.Scanner;

public class C02_startsWith {

    public static void main(String[] args) {

        String str =  "Java cok guzel";

        // str Java ile mi basliyor ?
        System.out.println(str.startsWith("Java")); //true

        // str Ja ile mi basliyor ?
        System.out.println(str.startsWith("Ja")); //true

        // str java ile mi basliyor ?
        System.out.println(str.startsWith("java")); //false

        // 5.index ve sonrasi "cok" ile mi basliyor ?
        System.out.println(str.startsWith("cok", 5)); //true

        System.out.println(str.startsWith("", 8)); //true
    }
}
