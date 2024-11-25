package day12_stringManipulations;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str = "J12$%av)(a     C?and&^ir";

        str = str.replaceAll("\\s+", " ");

        str = str.replaceAll("\\d", "");

        str = str.replaceAll("\\s", "5");

        str = str.replaceAll("\\W", "");

        str = str.replaceAll("5", " ");

        System.out.println(str);
    }
}
