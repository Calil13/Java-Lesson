package day04_dataCasting_wrapperClasses;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        String fiyat1 = "23";
        String fiyat2 = "30";

        System.out.println(fiyat1 + fiyat2);

        int sonuc =  Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2);

        System.out.println("Fiyat: " + sonuc);
    }

}
