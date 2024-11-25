package day18_scope;

public class C03_Static_Instance_Variables {

    static String hIsmi = "Yildiz hastanesi";
    static String hTelefonu = "0312 2343434";
    static String hAdresi = "Cankaya";

    String pIsmi;
    String pAdresi;
    String pTelefonu;

    public static void main(String[] args) {

        C03_Static_Instance_Variables pers1 = new C03_Static_Instance_Variables();

        System.out.println(pers1.pAdresi); // null
        System.out.println(pers1.pIsmi); // null
        System.out.println(pers1.pTelefonu); // null

        pers1.pAdresi = "Yenimahle";
        pers1.pIsmi = "Calil";
        pers1.pTelefonu = "2343223";

        System.out.println(pers1.pAdresi);
        System.out.println(pers1.pIsmi);
        System.out.println(pers1.pTelefonu);

        System.out.println(hIsmi);
        System.out.println(pers1.hIsmi);

        C03_Static_Instance_Variables pers2 = new C03_Static_Instance_Variables();
        System.out.println(pers2.pAdresi);
        System.out.println(pers2.pIsmi);
        System.out.println(pers2.pTelefonu);

        pers2.pIsmi = "Nuray";
        pers2.pAdresi = "Lenkeran";
        pers2.pTelefonu = "3465734";

        System.out.println(pers2.pAdresi);
        System.out.println(pers2.pIsmi);
        System.out.println(pers2.pTelefonu);

        pers2.hAdresi = "Altindag";

        System.out.println(hAdresi);
        System.out.println(pers2.hAdresi);
        System.out.println(pers1.hAdresi);
    }
}
