package day15_methodOlusturmaVeKullanma;

public class C04_MethodOlusdurma_KucukOlmayaniYazdir {

    public static void main(String[] args) {

        // verilen iki tamsayidan kucuk olmayani yazdirin

        kucukOlmayaniYazdir(7,9);
    }


    public static void kucukOlmayaniYazdir(int sayi1 , int sayi2){

        System.out.println(sayi1<sayi2 ? sayi2 : sayi1);
    }
}
