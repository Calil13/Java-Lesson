package day20_arrays_MulriDimensionalArrays;

public class C02_PozitifElemanlarinToplami {

    public static void main(String[] args) {

        int[] arr = {4,8,9,0,1,-3};

        System.out.println(pozitifElemanlarinTopla(arr));
    }

    public static int pozitifElemanlarinTopla(int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0){

                toplam += arr[i];

            }
        }
        return toplam;
    }
}
