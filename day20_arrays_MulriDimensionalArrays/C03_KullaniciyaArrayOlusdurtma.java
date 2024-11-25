package day20_arrays_MulriDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KullaniciyaArrayOlusdurtma {

    public static void main(String[] args) {

        String[] isimler = kullaniciyaArrayOlustur();

        System.out.println(Arrays.toString(isimler));

    }

    public static String[] kullaniciyaArrayOlustur(){

        Scanner scanner = new Scanner((System.in));
        System.out.println("kac isimlik bir array olusturmak istersiniz? : ");
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] isimler = new String[length];

        for (int i = 0; i < isimler.length; i++) {

            System.out.println("Array'e eklemek icin bir isim giriniz : ");

            isimler[i] = scanner.nextLine();

        }
        return isimler;
    }
}
