package day15_methodOlusturmaVeKullanma;

public class C05_IsimDuzenle {

    public static void main(String[] args) {

        isimiDuzenle("celil","ahmedov");
        // calisir amma yazdirmaz

        System.out.println(isimiDuzenle("nurlana","ahmedov"));
        // yazdirir amma kayd etmez

        String isminYeniHali = isimiDuzenle("nuray","ahmedova");
        // yazdirir ve kayd eder
    }

    public static String isimiDuzenle( String isim , String soyIsim ){

        String duznlenmisIsim =
                isim.substring(0,1).toUpperCase()
                + isim.substring(1).toLowerCase()
                + " "
                + soyIsim.substring(0,1).toUpperCase()
                + soyIsim.substring(1).toLowerCase();

        return duznlenmisIsim;
    }
}
