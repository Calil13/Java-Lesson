package day16_methodKullanma_MethodOverLoading;

public class C07_WhileLoop {

    public static void main(String[] args) {

        int toplam = 0;

        // 20 den 30 a kadar olan sayilari (20 ve 30 dahil) while loop ile toplayin
        toplam = 0;
        int i = 20;

        while ( i <= 30){

            toplam += i;

            i++;
        }
        System.out.println("toplama isleminin sonucu : " + toplam);
    }
}
