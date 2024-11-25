package day12_stringManipulations;

public class C03_replaceAll {

    public static void main(String[] args) {

        String fiyatStr1 = "15.30 $";
        String fiyatStr2 = "11.45 $";

        fiyatStr1 = fiyatStr1.replaceAll("\\D", "");
        fiyatStr2 = fiyatStr2.replaceAll("\\D", "");

        double fiyat1 = Double.parseDouble(fiyatStr1);
        double fiyat2 = Double.parseDouble(fiyatStr2);

        fiyat1 /= 100;
        fiyat2 /= 100;

        System.out.println(fiyat2 + fiyat1 + "$");
    }
}
