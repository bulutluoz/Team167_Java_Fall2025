package day03_stringManipulation;

import java.util.Locale;

public class C02_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String str = "Ali geldi, saz caldi";

        System.out.println(str.toUpperCase()); // ALI GELDI, SAZ CALDI

        // Turkce de i İ   ve ı I
        // Eger ingilizce buyuk/kucuk harf degisimi,
        // kullandiginiz local dilin buyuk/kucuk harf degisiminden farkli ise

        // eger i'yi Turkce buyuk harfe yani İ ye cevirmek isterseniz

        System.out.println(str.toUpperCase(Locale.TRADITIONAL_CHINESE)); // ALI GELDI, SAZ CALDI

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // ALİ GELDİ, SAZ CALDİ

        str = str.toUpperCase(); // ALI GELDI, SAZ CALDI

        System.out.println("buyuk harfe kalici olarak cevrilen str : " + str); // ALI GELDI, SAZ CALDI

        // str'i kucuk harfe cevirin
        // not I ---> ı olmalidir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // alı geldı, saz caldı
    }
}
