package day11_stringManipulations;

public class C03_endsWith {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        // metin zevkli ile mi bitiyor ?
        System.out.println(str.endsWith("zevkli")); //true

        // metin "" ile mi biyiyor ?
        System.out.println(str.endsWith("")); //true
    }
}
