package day15_methodOlusturmaVeKullanma;

public class C06_MetiniTersineCevir {

    public static void main(String[] args) {


    }

    public  static String metiniTersineCevir( String metin){

        String tersMetin ="";

        for (int i = metin.length()-1; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);
        }
        
        return tersMetin;
    }
}
