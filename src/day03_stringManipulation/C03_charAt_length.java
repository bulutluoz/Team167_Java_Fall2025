package day03_stringManipulation;

public class C03_charAt_length {

    public static void main(String[] args) {

        String metin = "Java guzeldir"; //

        System.out.println(metin.charAt(0)); // J
        System.out.println(metin.charAt(4)); // space karakterini yazdirir
        System.out.println(metin.charAt(6)); // u

        // Java index kullanimina 0'dan baslar
        // Java'da karakter sayisi ve index birbirinden farklidir
        // metin --> karakter sayisi : 13
        // r 13.harfdir
        // ama r'nin index'i : 12


        // metin'in 7.karakteri--> u
        // metin'in 7.index'inde --> z (8.karakter)

        // length() bir String'deki karakter sayisini verir

        System.out.println(metin.length()); // 13

        String str = "Ben sana demedim mi, Java gun gectikce guzellesir.";

        System.out.println(str.length()); // 50



        // metin = "Java guzeldir"

        // metin'in son karakterini yazdirin
        System.out.println(metin.charAt(12)); // r

        // metin'in sondan 3. karakterini yazdirin
        System.out.println(metin.charAt(10)); // d

        metin = "Java bir tane demistim";
        // metin'in son karakterini yazdirin
        System.out.println(metin.charAt(12)); // e


        // Dinamik kod verilen input'a bagli olmadan
        // istenen sonucu bize veren koddur

        // metin'in son karakterini yazdirin
        System.out.println(metin.charAt(12)); // e
        // 50.satirdaki kod metin degisirse bize son karakteri vermez
        // hep 12.index'deki karakteri verir
        // oyle bir kod yazalim ki
        // metin ister 5, ister 10, isterse 50 karakter olsun
        // kod bize hep son karakteri versin

        System.out.println(); // metin 22 karakter oldugu icin son karakterin index'i 21
        System.out.println(metin.charAt(22-1)); // m

        System.out.println(metin.charAt(metin.length()-1)); // m

        metin = "Ali";
        System.out.println(metin.charAt(metin.length()-1)); // i

        metin = "Yasar ne yasar ne yasamaz";
        System.out.println(metin.charAt(metin.length()-1)); // z


        // metin'in sondan 3.karakterini dinamik olarak yazdirin
        System.out.println(metin.charAt(metin.length()-3)); // m

        metin = "Yasasin";
        System.out.println(metin.charAt(metin.length()-3)); // s


        // EGER son harfin index'inden buyuk bir index yazilirsa
        // Java IndexOutOfBounds (index sinirilarin disinda) hatasi verir

        System.out.println(metin.charAt(6)); // n

        System.out.println(metin.charAt(metin.length())); // length 7
        // StringIndexOutOfBoundsException: String index out of range: 7

    }
}
