package day11_stringManipulations;

public class C09_isEmpty_isBlank {

    public static void main(String[] args) {

        String s1 = "";
        String s2 = " ";
        String s3 = "     ";
        String s4 = "Hello World";

        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());

        System.out.println(s3.isBlank());
    }
}
