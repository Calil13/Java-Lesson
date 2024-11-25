package day15_methodOlusturmaVeKullanma;

public class C01_MethodKullanimi {

    public static void main(String[] args) {

        String str = "Java Candir";

        str.toUpperCase(); // method calisir amma consola bisey dondurmez

        System.out.println(str.toLowerCase()); // method calisir ve consola bisey dondurur,amma hafizada kalmaz

        String yeniStr = str.toUpperCase(); // method calisir ve hafizada kalir
    }
}
