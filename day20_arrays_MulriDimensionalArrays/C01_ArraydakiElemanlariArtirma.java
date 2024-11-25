package day20_arrays_MulriDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_ArraydakiElemanlariArtirma {

    public static void main(String[] args) {

        int[] arr = {3,7,1,8,4};
        int artirmaSayisi = 4;

        arr = arrayinElemanlariniArtirma(arr, artirmaSayisi);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayinElemanlariniArtirma(int[] arr, int artirmaMiktari){

        for (int i = 0; i < arr.length; i++) {

            arr[i] += artirmaMiktari;

        }
        return arr;
    }
}
