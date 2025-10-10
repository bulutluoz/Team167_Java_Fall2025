package day03_stringManipulation;

public class C05_substring {

    public static void main(String[] args) {

        String str = "Ali Mert";

        System.out.println(str.substring(2)); // i Mert
        // 2.index'den basla sona kadar tum metni getir

        System.out.println(str.substring(7)); // t

        System.out.println(str.substring(5)); // ert


        // sadece M yi yazdirmak istesek
        System.out.println(str.charAt(4)); // M

        // M'den baslayip sona kadar tum metni yazdirin
        System.out.println(str.substring(4)); // Mert


        // dinamik olarak sondan 2.karakteri yazdirin
        System.out.println(str.charAt(str.length()-2));


        // dinamik olarak
        // sondan 2.karakterden baslayip sona kadar tum metni yazdirin
        System.out.println(str.substring(str.length()-2)); // rt


        str = "Java guzeldir";

        // dinamik olarak son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1)); // r

        // aynisini substring ile yazsak
        System.out.println(str.substring(str.length()-1)); // r



        // index olarak length() degeri yani karakter sayisi girilirse

        // System.out.println(str.charAt(str.length())); // r
        // StringIndexOutOfBoundsException: String index out of range: 13


        // substring'e index olarak length girilirse
        // hata vermez HICLIK (yani bos bir satir) yazdirir

        System.out.println(str.substring(str.length())); // hiccclik

        //System.out.println(str.charAt(20)); // StringIndexOutOfBounds
        // System.out.println(str.substring(20)); // StringIndexOutOfBounds

    }
}
