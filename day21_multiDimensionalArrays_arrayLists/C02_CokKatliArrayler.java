package day21_multiDimensionalArrays_arrayLists;

public class C02_CokKatliArrayler {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];

        }
        System.out.println(toplam);


        int[][] arr2 = {{1,2,3}, {8,4}, {10}, {1,3,6,7}};
        toplam = 0;

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                toplam += arr2[i][j];

            }
        }
        System.out.println(toplam);
    }
}
