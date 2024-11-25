package day15_methodOlusturmaVeKullanma;

public class C06_MethodlariKullanma {

    public static void main(String[] args) {

        // 6! yazdir
        C02_MethodOlusturma.faktoryelDegeriYazdir(4);
        // 10! yazdir
        C02_MethodOlusturma.faktoryelDegeriYazdir(10);

        // 20719 asal ise true, asal degilse false yazdirin
        C03_MethodOlusdurma_AsalMi.asalMi(29);

        // isim duzenle methodu
        System.out.println(C05_IsimDuzenle.isimiDuzenle("aynure","ahmedova"));

        // ismi kayd et
        String yeniIsim = C05_IsimDuzenle.isimiDuzenle("celil", "ahmedov");

    }
}
