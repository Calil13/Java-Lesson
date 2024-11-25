package day19_arrays;

import java.util.Arrays;

public class C02_ArraydekiElementlereDegerAtamaVeKullanma {

    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        arr = new int[6];

        arr[2] = 5;
        arr[4] = 7;

        System.out.println(Arrays.toString(arr));

        System.out.println( arr[3]);

        System.out.println(arr[1] + arr[2]);

        //arr[6] = 10;
        // ArrayIndexOutOfBoundsException
        // Index 6 out of bounds for

        System.out.println(Arrays.toString(arr));

        arr = new int[5];
        System.out.println(Arrays.toString(arr));
    }
}
