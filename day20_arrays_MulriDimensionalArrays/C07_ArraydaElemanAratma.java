package day20_arrays_MulriDimensionalArrays;

import java.util.Arrays;

public class C07_ArraydaElemanAratma {

    public static void main(String[] args) {

        int[] arr = {1,5,7,8,-2,-1};

        System.out.println(Arrays.binarySearch(arr,-2));


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,-1));
        System.out.println(Arrays.binarySearch(arr,20));
    }
}
