package day16_methodKullanma_MethodOverLoading;

public class C05_OverLoading {

    public static void main(String[] args) {

        topla(3,5);

        topla('a','b');

    }

    public static void topla(double a, double b){

        System.out.println("Iki double'in toplami: " + (a+b));
    }
}
