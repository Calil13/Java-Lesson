package day21_multiDimensionalArrays_arrayLists;

public class C03_CokKatliArrayDeCiftSayilariTopla {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {8,4}, {10}, {1,3,6,7}};

        ikiKatliArraydakiCiftSayilarinToplami(arr);
    }

    public static void ikiKatliArraydakiCiftSayilarinToplami(int[][] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0){

                    toplam += arr[i][j];

                }
            }
        }
        System.out.println("Arraydaki cift sayilarin toplami : " + toplam);
    }
}
