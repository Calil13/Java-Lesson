package day20_arrays_MulriDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_MetinSifrele {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("sifrelenecek metini girin : ");
        String metin = scanner.nextLine().toLowerCase();

        String[] karakterler = metin.split("");

        System.out.println(Arrays.toString(karakterler));

        for (int i = 0; i < karakterler.length; i++) {

            if (metin.charAt(i) >= 'a' && metin.charAt(i) <= 'w'){

                karakterler[i] = (char)(metin.charAt(i)+3)+"";

            } else if (metin.charAt(i) >= 'x' && metin.charAt(i) <= 'z') {

                karakterler[i] = (char)(metin.charAt(i)+3-36)+"";

            }
        }
        System.out.println(Arrays.toString(karakterler));

        String yeniMetin = String.join("",karakterler);

        System.out.println("Metinin yeni hali: " + yeniMetin);
    }
}
