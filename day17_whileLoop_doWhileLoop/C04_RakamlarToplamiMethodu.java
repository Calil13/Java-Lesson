package day17_whileLoop_doWhileLoop;

public class C04_RakamlarToplamiMethodu {

    public static void main(String[] args) {

        System.out.println(rakamlarToplaminiBul(12));

    }

    public static int rakamlarToplaminiBul(int sayi){

        int rakamlarToplami = 0;
        int birlerBasamagi = 0;
        int dummyNumber = sayi;

        while ( dummyNumber != 0) {

            birlerBasamagi = dummyNumber % 10;
            rakamlarToplami += birlerBasamagi;
            dummyNumber /= 10;

        }
        return rakamlarToplami;
    }
}
