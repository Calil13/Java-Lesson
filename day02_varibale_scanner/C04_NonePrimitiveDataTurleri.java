package day02_varibale_scanner;

public class C04_NonePrimitiveDataTurleri {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str);

        System.out.println( str.toUpperCase());
        System.out.println( str.toLowerCase());

        System.out.println(str);

        // Stringde atama olmadigi surece, methodlarla yapilan degisiklikler KALICI OLMAZ

        str = str.toUpperCase();

        System.out.println(str);


    }

}