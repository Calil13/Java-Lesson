package day14_forLoop_methodOlusdurma;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        /*
           for loop kulanarak asagidaki sayilari yazdirin
                    1 2 3 4
                    2 4 6 8
                    3 6 9 12
                    4 8 12 16

           EGER for loop ile 2 boyutlu bir sekil olusturacaksak
           ic ice 2 loop kullanmamiz gerekir
        */

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {

                System.out.print( i * j + " ");
            }
            System.out.println("");
        }
    }
}
