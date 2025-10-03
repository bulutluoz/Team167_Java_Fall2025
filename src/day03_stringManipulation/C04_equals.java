package day03_stringManipulation;

public class C04_equals {

    public static void main(String[] args) {

        // primitive data turlerinde karsilastirma icin == kullanilir

        int a = 5;
        int b = 7;
        int c = 2;

        System.out.println( a == b ); // false
        System.out.println( b == a + c ); // true

        // ama String'de metinlerin ayni oldugunu kontrol etmek icin
        // == kullanilmasi tavsiye edilmez


        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "li";
        String s4 = new String("Ali");
        String str = "A";
        String abc = "li";
        String s5 = str + abc ; // "A" + "li"

        System.out.println(s1 == s2); // Ali <==> Ali  true
        System.out.println(s1 == s3); // Ali <==> Ali  true
        System.out.println(s1 == s4); // Ali <==> Ali  false
        System.out.println(s1 == s5); // Ali <==> Ali  false
        System.out.println(s1 == "Ali"); // Ali <==> Ali  true

        // == String'de kullanilirsa
        // hem metin degerine hem de referans'a bakar (ilerde anlatilacak)
        // bu sebeple == ,metinler ayni olsa da bazen true bazen false verebilir


        // EGER sadece metin olarak karsilastirmak isterseniz
        // == degil equals() kullanilmalidir

        System.out.println(s1.equals(s2)); // Ali <==> Ali  true
        System.out.println(s1.equals(s3)); // Ali <==> Ali  true
        System.out.println(s1.equals(s4)); // Ali <==> Ali  true
        System.out.println(s1.equals(s5)); // Ali <==> Ali  true
        System.out.println(s1.equals("Ali")); // Ali <==> Ali  true

        System.out.println("Ali".equals("ali")); // false
        System.out.println("Ali".equals("ALI")); // false
        System.out.println("Ali".equals("A l i")); // false
        System.out.println("Ali".equals("Ali ")); // false
        System.out.println("Ali".equals(" Ali")); // false

        // Eger buyuk kucuk harf onemli olmasin
        // metin onemli olsun derseniz
        // Pazartesi, pazartesi, PAZARTESI, PaZaRtEsI, PAZARtesi

        System.out.println("Pazartesi".equalsIgnoreCase("PAZARTESI")); // true
        System.out.println("Pazartesi".equalsIgnoreCase("pazartesi")); // true
        System.out.println("Pazartesi".equalsIgnoreCase("PAZARtesi")); // true
        System.out.println("Pazartesi".equalsIgnoreCase("PaZaRtEsI")); // true
        System.out.println("Pazartesi".equalsIgnoreCase("PAZARTESE")); // false
        System.out.println("Pazartesi".equalsIgnoreCase("PAZARTESI ")); // false







    }
}
