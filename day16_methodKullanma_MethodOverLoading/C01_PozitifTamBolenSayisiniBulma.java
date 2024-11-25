package day16_methodKullanma_MethodOverLoading;

public class C01_PozitifTamBolenSayisiniBulma {

    public static void main(String[] args) {

        System.out.println(pozitifTamBolenSayisi(20));
        System.out.println(pozitifTamBolenSayisi(100));
    }

    public static int pozitifTamBolenSayisi( int sayi ){

        int pozTamBolenSayisi = 0;

        for (int i = 1; i <= sayi ; i++) {

            if (sayi % i == 0){
                pozTamBolenSayisi++;
            }
        }
        return  pozTamBolenSayisi;
    }
}
