package day10_stringManipulations;

public class C05_concat {

    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "candir";
        String s3 = " ";
        int sayi1 = 3;
        int sayi2 = 4;

        System.out.println(s1+s3+s2+s3+sayi1+sayi2);

        System.out.println(s1.concat(s3).concat(s2).concat(s3).concat(""+sayi1).concat(""+sayi2));
    }
}
