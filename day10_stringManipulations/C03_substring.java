package day10_stringManipulations;

public class C03_substring {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.length());

        System.out.println(str.charAt(11));

        System.out.println(str.substring(9));

        System.out.println(str.substring(5));

        System.out.println(str.substring(str.length() - 5));
    }
}
