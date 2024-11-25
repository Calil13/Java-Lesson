package day11_stringManipulations;

public class C07_LastindexOf {

    public static void main(String[] args) {

        String str = "ali topu tut, tut ali tut";

        System.out.println(str.indexOf("tut"));

        System.out.println(str.indexOf("tut", 10));

        System.out.println(str.indexOf("tut", 15));

        System.out.println(str.indexOf("ali"));

        System.out.println(str.indexOf("ali", 1));

        System.out.println(str.lastIndexOf("ali"));



    }
}
