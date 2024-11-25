package day09_ternary_switch;

public class C01_Ternary {
    public static void main(String[] args) {

        int sayi = 5;

        System.out.println(sayi % 2 == 0 ? "Cift sayi" : "Tek sayi");

        sayi = sayi<0 ? sayi+10 : sayi-3;
        System.out.println(sayi);
    }
}
