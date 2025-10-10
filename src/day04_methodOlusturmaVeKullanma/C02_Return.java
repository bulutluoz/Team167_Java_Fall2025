package day04_methodOlusturmaVeKullanma;

public class C02_Return {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.length()); // int 11
        System.out.println(str.charAt(3)); // char a
        System.out.println(str.equalsIgnoreCase("Java")); // boolean false


        int sonuc1 = str.length() ;
        char sonuc2 = str.charAt(3);
        boolean sonuc3 = str.equalsIgnoreCase("Java");

        // Matematiksel islemlerde bir islem sonucunda elde edilen deger'e : sonuç diyoruz
        // Method'larda method calistiktan sonra method'un cagrildigi yere gelen degere
        // return (döndördü)

        /*
            ornegin
            str.length() method'u int bir sonuc döndürür
            str.charAt() method'u char bir sonuc döndürür
            str.equalsIgnoreCase("Java"); method'u boolean bir sonuc döndürür

            bu degerleri method'u kullanirken sag tarafta goruruz
         */

        str.toUpperCase();


        System.out.println(str.toLowerCase());

        String buyukHali = str.toUpperCase();

        System.out.println(buyukHali); // JAVA CANDIR
    }
}
