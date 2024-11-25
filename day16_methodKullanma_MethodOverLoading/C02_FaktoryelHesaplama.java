package day16_methodKullanma_MethodOverLoading;

import java.util.Scanner;

public class C02_FaktoryelHesaplama {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi girin: ");
        int sayi = scanner.nextInt();

        sayi = sayi + faktoryelDegeriDondur(sayi);


    }

    public static int faktoryelDegeriDondur( int sayi ){

        int faktoryerlDegeri = 1;

        for (int i = 1; i <=sayi ; i++) {

            faktoryerlDegeri *= i;

        }
        return faktoryerlDegeri;
    }
}
