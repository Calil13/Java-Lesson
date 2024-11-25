package day21_multiDimensionalArrays_arrayLists;

import java.util.Arrays;

public class C01_CokKatliArrayler {

    public static void main(String[] args) {

        int[][] ikiKatlilar = {{2,3,4} , {5,6} , {8} , {1,2,3,4}};

        System.out.println(ikiKatlilar[0][1]); // 3
        System.out.println(ikiKatlilar[1][1]); // 6

        System.out.println(Arrays.toString(ikiKatlilar[3]));

        System.out.println(Arrays.toString(ikiKatlilar));

        System.out.println(Arrays.deepToString(ikiKatlilar));
    }
}
